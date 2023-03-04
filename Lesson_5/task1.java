package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task1 {

    private final Map<String, List<String>> data = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (!data.containsKey(name)) { // Если у человека еще нет записи в телефонной книге, создаем новый список телефонов
            data.put(name, new ArrayList<>());
        }
        data.get(name).add(phoneNumber); // Добавляем телефон в список для данного человека
    }

    public List<String> get(String name) {
        return data.getOrDefault(name, new ArrayList<>()); // Возвращаем список телефонов для данного человека, или пустой список, если запись отсутствует
    }

    public static void main(String[] args) {
        task1 phonebook = new task1();

        phonebook.add("Иванов", "111-111");
        phonebook.add( "Иванов", "222-222");
        phonebook.add("Петров", "333-333");
        phonebook.add("Сидоров", "444-444");
        phonebook.add("Петров", "555-555");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Новиков"));
    }
}