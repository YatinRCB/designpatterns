package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The FanReads class is an observer that recommends books to a customer based on their preferred genres.
 */
public class FanReads implements Observer {
    private Subject subject;
    private Map<Genre, List<Book>> recommendations;

    /**
     * Constructs a new FanReads object and registers it as an observer of a subject.
     *
     * @param subject   the subject to observe
     * @param firstName the first name of the customer
     * @param lastName  the last name of the customer
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.recommendations = new HashMap<>();
        for (Genre genre : Genre.values()) {
            recommendations.put(genre, new ArrayList<>());
        }
        subject.registerObserver(this);
    }

    /**
     * Updates the list of recommended books when notified by the subject.
     *
     * @param book the book that was added to the best-sellers list
     */
    @Override
    public void update(Book book) {
        List<Book> genreBooks = recommendations.get(book.getGenre());
        genreBooks.add(book);
    }

    /**
     * Returns the list of recommended books for a specific genre.
     *
     * @param genre the genre of books to recommend
     * @return a list of recommended books
     */
    public List<Book> getRecommendations(Genre genre) {
        return recommendations.getOrDefault(genre, new ArrayList<>());
    }
}
