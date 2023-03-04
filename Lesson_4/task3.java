package Lesson_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(6);

        int sum = sumLinkedList(list);
        System.out.println("Sum of all elements in LinkedList: " + sum);
    }

    public static int sumLinkedList(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}

