import java.util.List;

/**
 * Runs the Party Program
 */
public class ListDriver {
    private final Attendees attendees;

    /**
     * Creates the new Guest List
     */
    public ListDriver() {
        attendees = new Attendees("\nMy Kids Birthday Party\n");
    }

    /**
     * Adds and removes guests from the list, then displays the lsit
     */
    public void run() {
        System.out.println("\nCreating List:");
        addGuest("Jenny", "Davidson", "803-423-7878", "Had skinny looking dog.");
        addGuest("Sally", "Anderson", "803-222-7656", "Alergic to Nuts");
        addGuest("Kyle", "Anderson", "803-566-4545", "Mom can't park car");
        addGuest("Greg", "Parkson","803-878-5564", "NA");
        addGuest("Michael", "Bailey", "803-232-6655", "Loves hot dogs");
        addGuest("Brad", "Zenker", "803-554-6868", "Lactose Intellorant");
        addGuest("Trevor", "Davenport", "803-454-9944", "Can't sit still");
        addGuest("Jamie", "Jeffries", "803-656-3344", "Scared of dogs");
        addGuest("Greg", "Parkson","803-878-5564", "He's Halarious");
        addGuest("Jamie", "Jeffries", "803-656-3344", "Likes Cats");
        addGuest("Jenny", "Davidson", "803-423-7878", "Daughters best friend");

        BinarySearch bSearch = new BinarySearch();
        attendees.setSearchBehavior(bSearch);

        addGuest("Sara", "Anderson", "803-566-3434", "Wins every contest");
        addGuest("Kim", "Smith", "803-555-3434", "Loves crafts");
        addGuest("Jamie", "Jeffries", "803-656-3344", "NA");
        addGuest("Michael", "Bailey", "803-232-6655", "Loves pizza");
        addGuest("Sara", "Anders", "803-566-1114", "Always throwing things");
        displayList();
    }

    /**
     * Loops through and displays each member of the guest list
     */
    private void displayList() {
        System.out.println("\n" + attendees.getTitle());
        List<Person> guests = attendees.getList();

        for (Person guest : guests) {
            System.out.println("  - " + guest);
        }
    }

    /**
     * Creates a person with the specified information and adds them to the list
     * @param firstName First Name of Guest
     * @param lastName Last Name of Guest
     * @param phoneNumber Phone Number of Guest
     * @param reminder Special Note about Guest
     */
    private void addGuest(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = attendees.add(firstName, lastName, phoneNumber, reminder);
        if (person != null) {
            System.out.println("Add : " + firstName + " " + lastName);
        } else {
            System.out.println("Already on list: " + firstName + " " + lastName);
        }
    }

    public static void main(String[] args) {
        ListDriver driver = new ListDriver();
        driver.run();
    }
}
