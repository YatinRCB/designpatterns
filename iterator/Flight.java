import java.time.Duration;
import java.time.LocalTime;

/**
 * The Flight class represents a flight between two airports with details such as flight number, departure, arrival times, and number of transfers.
 * 
 * @author Yatin Raju
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a new Flight.
     * 
     * @param flightNum The flight number.
     * @param from The origin airport.
     * @param to The destination airport.
     * @param startTime The departure time.
     * @param endTime The arrival time.
     * @param numTransfers The number of transfers or stopovers for the flight.
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Gets the origin airport of the flight.
     * 
     * @return The origin Airport.
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Gets the destination airport of the flight.
     * 
     * @return The destination Airport.
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks if the flight's origin and destination match the provided airports.
     * 
     * @param from The origin airport.
     * @param to The destination airport.
     * @return True if the flight's origin and destination match the parameters.
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns a string representation of the flight, including its start time, end time, and transfer information.
     * 
     * @return A formatted string with flight details.
     */
    @Override
    public String toString() {
        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        String durationStr = String.format("%dh %02dm", hours, minutes);

        String transferInfo;
        if (numTransfers == 0) {
            transferInfo = "Direct Flight";
        } else if (numTransfers == 1) {
            transferInfo = "1 Stopover";
        } else {
            transferInfo = numTransfers + " Transfers";
        }

        return String.format("%s to %s %s - %s (%s) %s", from, to, startTime, endTime, durationStr, transferInfo);
    }
}
