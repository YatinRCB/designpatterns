import java.util.ArrayList;
import java.util.List;

public class Attendees {
    private String title;
    private List<Person> guests;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
        this.guests = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Person> getList() {
        return guests;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

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

