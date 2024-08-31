package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The BestSellers class maintains a list of best-selling books and notifies observers of any updates.
 */
public class BestSellers implements Subject {
    private List<Observer> observers;
    private List<Book> bestSellers;

    /**
     * Constructs a new BestSellers object.
     * Initializes the lists of observers and best-selling books.
     */
    public BestSellers() {
        observers = new ArrayList<>();
        bestSellers = new ArrayList<>();
    }

    /**
     * Registers an observer to the BestSellers list.
     *
     * @param observer the observer to be registered
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the BestSellers list.
     *
     * @param observer the observer to be removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers about a new book.
     *
     * @param book the book that was added to the best-sellers list
     */
    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * Adds a new book to the best-sellers list and notifies observers.
     *
     * @param title         the title of the book
     * @param genre         the genre of the book
     * @param authorFirstName the first name of the author
     * @param authorLastName  the last name of the author
     * @param description   the description of the book
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book newBook = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(newBook);
        notifyObservers(newBook);
    }
}
