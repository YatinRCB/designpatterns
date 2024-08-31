package observer;

/**
 * The Subject interface represents the entity that maintains a list of observers.
 * It notifies observers of any changes to its state.
 */
public interface Subject {
    /**
     * Registers an observer to the subject.
     *
     * @param observer the observer to be registered
     */
    void registerObserver(Observer observer);

    /**
     * Removes an observer from the subject.
     *
     * @param observer the observer to be removed
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers about a change.
     *
     * @param book the book that triggered the update
     */
    void notifyObservers(Book book);
}

