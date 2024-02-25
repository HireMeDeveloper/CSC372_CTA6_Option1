import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSorter {
    private static int GetMinIndex(ArrayList<Student> array, int start, int end, Comparator<Student> comparator){
        if (start == end) return  start;

        var min = start;
        for (int i = start; i <= end; i++) {
            if (comparator.compare(array.get(i), array.get(min)) < 0) min = i;
        }

        return min;
    }

    // Recursively sort the unsorted portion of the array
    public static ArrayList<Student> Sort(ArrayList<Student> array, int size, int index, Comparator<Student> comparator){
        if (index == size) return array;

        var minIndex = GetMinIndex(array, index, array.size() - 1, comparator);

        if (index != minIndex){
            final var temp = array.get(index);
            array.set(index, array.get(minIndex));
            array.set(minIndex, temp);
        }

        return Sort(array, size, index + 1, comparator);
    }

    public static ArrayList<Student> Sort(ArrayList<Student> array, Comparator<Student> comparator){
        return Sort(array, array.size(), 0, comparator);
    }
}
