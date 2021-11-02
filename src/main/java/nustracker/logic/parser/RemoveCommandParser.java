package nustracker.logic.parser;

import static java.util.Objects.requireNonNull;
import static nustracker.commons.core.Messages.MESSAGE_COMMAND_EXTRANEOUS_BACKSLASHES;
import static nustracker.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static nustracker.logic.parser.CliSyntax.PREFIX_EVENT;
import static nustracker.logic.parser.CliSyntax.PREFIX_STUDENTID;

import nustracker.logic.commands.RemoveCommand;
import nustracker.logic.parser.exceptions.ExtraBackslashException;
import nustracker.logic.parser.exceptions.ParseException;
import nustracker.model.event.EventName;
import nustracker.model.student.StudentId;

public class RemoveCommandParser implements Parser<RemoveCommand> {

    @Override
    public RemoveCommand parse(String args) throws ParseException {
        requireNonNull(args);

        ArgumentMultimap argMultimap = null;

        try {
            argMultimap = ArgumentTokenizer.tokenize(args,
                    PREFIX_STUDENTID,
                    PREFIX_EVENT);
        } catch (ExtraBackslashException e) {
            throw new ParseException(String.format(MESSAGE_COMMAND_EXTRANEOUS_BACKSLASHES,
                    RemoveCommand.MESSAGE_USAGE));
        }

        if (!argMultimap.arePrefixesPresent(PREFIX_STUDENTID, PREFIX_EVENT) || !argMultimap.getPreamble().isEmpty()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, RemoveCommand.MESSAGE_USAGE));
        }

        StudentId studentId = ParserUtil.parseStudentId(argMultimap.getValue(PREFIX_STUDENTID).get());

        EventName eventName = ParserUtil.parseEventName(argMultimap.getValue(PREFIX_EVENT).get());

        return new RemoveCommand(studentId, eventName);
    }


}
