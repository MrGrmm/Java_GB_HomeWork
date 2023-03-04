package Lesson_4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(6);
        System.out.println("Original list: " + list);

        LinkedList<Integer> reversed = reverseLinkedList(list);
        System.out.println("Reversed list: " + reversed);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> original) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = original.size() - 1; i >= 0; i--) {
            reversed.add(original.get(i));
        }
        return reversed;
    }
}
