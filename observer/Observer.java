package observer;

/**
 * The Observer interface should be implemented by any class that wants to be informed of changes in a Subject.
 */
public interface Observer {
    /**
     * This method is called when the Subject's state changes.
     *
     * @param book the book that triggered the update
     */
    void update(Book book);
}

