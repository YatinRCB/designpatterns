/**
 * Creates a new Person
 */
public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String reminder;

    /**
     * Creates a new Person
     * @param firstName The persons first name
     * @param lastName The persons last name
     * @param phoneNumber The persons phone number
     * @param reminder The note saved about the person
     */
    public Person(String firstName, String lastName, String phoneNumber, String reminder){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.reminder = reminder;
    }

    /**
     * Sets the note about the person
     * @param reminder A note about the person
     */
    public void setReminder(String reminder){
        this.reminder = reminder;
    }

    /**
     * Gets the First Name of the Person
     * @return Persons First Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the Last Name of the Person
     * @return Persons Last Name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the Phone Number of the Person
     * @return The Persons phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the Personal Note about the person
     * @return The personal note about the person
     */
    public String getReminder() {
        return reminder;
    }

    /**
     * Lexigraphically compares itself to the person provided
     * @param person The person to compare to
     * @return 1 if it's bigger than the person passed in, 0 if equal, and -1 if smaller
     */
    @Override
    public int compareTo(Person person) {
        if(lastName.compareTo(person.getLastName()) > 0) {
            return 1;
        } else if(lastName.compareTo(person.getLastName()) < 0){
            return -1;
        }

        return firstName.compareTo(person.getFirstName());
    }

    /**
     * Lexigraphically compares itself to the person provided
     * @param person The person to compare to
     * @return true if equal and false if different
     */
    @Override
    public boolean equals(Object person){
        return ((Person)person).firstName.equalsIgnoreCase(firstName) && ((Person)person).lastName.equalsIgnoreCase(lastName);
    }

    /**
     * Creates a string representation of the person
     * @return all the information about the person
     */
    public String toString() {
        return firstName + " " + lastName + ": " + phoneNumber + " (" + reminder + ").";
    }
}
