import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();

        students.add(new Student(1, "James", "Caster Ave"));
        students.add(new Student(5, "Cameron", "Crocodile Ave"));
        students.add(new Student(2, "Sophie", "Court Ave"));
        students.add(new Student(4, "Felisha", "Candice Ave"));
        students.add(new Student(3, "Tyler", "Comb Ave"));

        var sortedByName = SelectionSorter.Sort(students, new CompareByName());
        System.out.println("Sorted by name: ");
        for (int i = 0; i < sortedByName.size(); i++) {
            System.out.println(sortedByName.get(i).toString());
        }
        System.out.println();

        var sortedByRollNumber = SelectionSorter.Sort(students, new CompareByRoll());
        System.out.println("Sorted by roll number: ");
        for (var student : sortedByRollNumber) {
            System.out.println(student.toString());
        }
    }


}