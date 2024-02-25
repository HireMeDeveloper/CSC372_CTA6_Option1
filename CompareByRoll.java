import java.util.Comparator;

public class CompareByRoll implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getRollNo() - second.getRollNo();
    }
}
