import java.util.ArrayList;
import java.util.List;

/**
 * Manages the list of attendees for the event.
 */
public class Attendees {
    private String title;
    private final List<Person> guests;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
        this.guests = new ArrayList<>();
    }

    /**
     * Returns the title of the event.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the list of attendees.
     */
    public List<Person> getList() {
        return guests;
    }

    /**
     * Sets the search behavior strategy.
     */

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Adds a person to the list if they are not already on it.
     */
    
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person newPerson = new Person(firstName, lastName, phoneNumber, reminder);
        if (searchBehavior != null && searchBehavior.contains(guests, newPerson)) {
            return null; // Person is already on the list
        } else {
            guests.add(newPerson);
            guests.sort(null); // Sort the list after adding the new person
            return newPerson;
        }
    }
}

