package Lesson_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        
        // создаем список сотрудников
        List<String> employees = Arrays.asList(
            "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
            "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
            "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
            "Иван Мечников", "Петр Петин", "Иван Ежов"
        );
        
        // создаем TreeMap для подсчета количества повторений имен
        Map<String, Integer> nameCountMap = new TreeMap<>(Collections.reverseOrder());
        for (String name : employees) {
            if (nameCountMap.containsKey(name)) {
                nameCountMap.put(name, nameCountMap.get(name) + 1);
            } else {
                nameCountMap.put(name, 1);
            }
        }
        
        // выводим повторяющиеся имена с количеством повторений
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}