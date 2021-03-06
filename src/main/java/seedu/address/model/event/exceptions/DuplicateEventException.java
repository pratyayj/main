package seedu.address.model.event.exceptions;

/**
 * Signals that the operation will result in duplicate {@code Event} (Events are considered duplicates if they have
 * the same
 * identity as defined in {@code Event#isSameEvent(Event)}).
 */
public class DuplicateEventException extends RuntimeException {
    public DuplicateEventException() {
        super("Operation would result in duplicate events");
    }
}
