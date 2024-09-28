import java.util.ArrayList;

/**
 * The Airline class represents an airline with a list of flights and provides a way to iterate over flights that match a specific route.
 * 
 * @author Yatin Raju
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructs a new Airline with the given title and loads the flights from the FlightLoader.
     * 
     * @param title The title of the airline (e.g., "American Airlines").
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights(); // Load flights from the file
    }

    /**
     * Gets the title of the airline.
     * 
     * @return The title of the airline.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates an iterator to iterate through flights that match the provided origin and destination codes.
     * 
     * @param fromCode The origin airport code.
     * @param toCode The destination airport code.
     * @return A FlightIterator for the matching flights, or null if the codes are invalid.
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode.toUpperCase());
            Airport to = Airport.valueOf(toCode.toUpperCase());
            return new FlightIterator(flights, from, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes");
            return null;
        }
    }
}
