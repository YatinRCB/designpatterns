import java.util.List;

/**
 * Interface for defining search behavior in the guest list.
 */

public interface SearchBehavior {
    boolean contains(List<Person> list, Person person);
}
