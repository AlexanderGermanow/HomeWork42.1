package lesson33.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #33
 *
 * @author Alexander Germanow
 * @version 08-Apr-24
 */
public class HomeWork33 {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(List.of(3, 4, 5, 6, 7));
        List<Integer> listThree = new ArrayList<>(List.of(6, 7, 8, 9, 0));

        System.out.println(getInterselectionOfLists(listOne,listTwo));
        System.out.println(getInterselectionOfLists(listOne, listThree));
        System.out.println(interselection(listOne, listTwo));
        System.out.println(interselection(listOne, listThree));
    }

    static <T> List<T> interselection(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2); // пересечение
        return result;
    }

    static <T> List<T> getInterselectionOfLists(List<T> listOne, List<T> listTwo) {
        List<T> result = new ArrayList<>();
        for (T item : listOne) {
            if (listTwo.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
