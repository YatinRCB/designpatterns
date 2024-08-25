import java.util.List;

public class BinarySearch implements SearchBehavior {

    @Override
    public boolean contains(List<Person> list, Person person) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Person midPerson = list.get(mid);
            int compare = midPerson.compareTo(person);

            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

