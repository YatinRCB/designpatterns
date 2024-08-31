package observer;

/**
 * The Book class represents a book with a title, genre, author's name, and a description.
 */
public class Book {
    private final String title;
    private final Genre genre;
    private final String authorFirstName;
    private final String authorLastName;
    private final String description;

    /**
     * Constructs a new Book object with the specified details.
     *
     * @param title          the title of the book
     * @param genre          the genre of the book
     * @param authorFirstName the first name of the author
     * @param authorLastName  the last name of the author
     * @param description    the description of the book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * Returns the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the genre of the book.
     *
     * @return the genre of the book
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Returns the first name of the author.
     *
     * @return the first name of the author
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Returns the last name of the author.
     *
     * @return the last name of the author
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Returns the description of the book.
     *
     * @return the description of the book
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a string representation of the book, formatted for display.
     *
     * @return a formatted string of the book details
     */
    @Override
    public String toString() {
        String formattedDescription = formatDescription(description, 80);
        return "----- " + title + "-----\n" +
               genre.label + " by: " + authorFirstName + " " + authorLastName + "\n" +
               formattedDescription + "\n";
    }

    /**
     * Formats the description text to wrap after a certain character length.
     *
     * @param text the text to be formatted
     * @param maxLineLength the maximum length of each line
     * @return the formatted text
     */
    private String formatDescription(String text, int maxLineLength) {
        StringBuilder formatted = new StringBuilder();
        String[] words = text.split(" ");
        int lineLength = 0;

        for (String word : words) {
            if (lineLength + word.length() > maxLineLength) {
                formatted.append("\n");
                lineLength = 0;
            }
            formatted.append(word).append(" ");
            lineLength += word.length() + 1;
        }

        return formatted.toString().trim();
    }
}
