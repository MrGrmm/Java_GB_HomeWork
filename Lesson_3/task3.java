package Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    
        // Находим минимальное и максимальное значение
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int value = list.get(i);
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // Находим среднее арифметическое
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        double average = (double) sum / (double) list.size();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average: " + average);
    }
}

