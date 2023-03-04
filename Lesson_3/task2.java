package Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("Original list: " + list);
        removeEvenNumbers(list);
        System.out.println("List without even numbers: " + list);
    }

    public static void removeEvenNumbers(List<Integer> list) {
        list.removeIf(n -> n % 2 == 0);
    }
}

