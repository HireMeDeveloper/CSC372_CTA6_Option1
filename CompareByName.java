import java.util.Comparator;

public class CompareByName implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getName().compareTo(second.getName());
    }
}
