import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

public class ISE_3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Elements in ArrayList:");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);

        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> checkList = new ArrayList<>(Arrays.asList(3, 5));
        boolean containsAll = arrayList.containsAll(checkList);
        System.out.println("ArrayList contains all elements from checkList: " + containsAll);

        Integer[] array = new Integer[arrayList.size()];
        arrayList.toArray(array);
        System.out.println("Array from ArrayList: " + Arrays.toString(array));

        ArrayList<Integer> subList = new ArrayList<>(arrayList.subList(1, 4));
        System.out.println("Sublist from ArrayList: " + subList);

        Collections.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        Collections.swap(arrayList, 1, 3);
        System.out.println("ArrayList after swapping elements: " + arrayList);
    }
}

