import java.util.ArrayList;
import java.util.Iterator;

/**
 * The FlightIterator class implements an iterator to iterate over flights that match a specific origin and destination.
 * 
 * @author Yatin Raju
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Constructs a new FlightIterator.
     * 
     * @param flights The list of flights to iterate over.
     * @param from The origin airport.
     * @param to The destination airport.
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
        this.position = 0;
    }

    /**
     * Checks if there are more flights that match the origin and destination.
     * 
     * @return True if there are more matching flights.
     */
    @Override
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next flight that matches the origin and destination.
     * 
     * @return The next matching flight.
     */
    @Override
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}
