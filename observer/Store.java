package observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The Store class is an observer that keeps track of the top 5 best-selling books.
 */
public class Store implements Observer {
    private Subject subject;
    private Queue<Book> bestSellers;

    /**
     * Constructs a new Store object and registers it as an observer of a subject.
     *
     * @param subject the subject to observe
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }

    /**
     * Updates the list of best-selling books when notified by the subject.
     * Keeps only the top 5 books.
     *
     * @param book the book that was added to the best-sellers list
     */
    @Override
    public void update(Book book) {
        if (bestSellers.size() == 5) {
            bestSellers.poll(); // Remove the oldest book if more than 5
        }
        bestSellers.add(book);
    }

    /**
     * Returns the list of the current top 5 best-selling books.
     *
     * @return a list of the best-selling books
     */
    public List<Book> getBestSellers() {
        return new LinkedList<>(bestSellers);
    }
}

