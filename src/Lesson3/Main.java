package Lesson3;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"he", "it", "put", "cut", "he", "she", "we", "more", "sea", "sea", "it"};
        HashMap<String, Integer> word = new HashMap<>();
        for (String x : words) {
            word.put(x, word.getOrDefault(x, 0) + 1);
        }
        System.out.println(word);

        Phonebook book = new Phonebook();
        book.addPerson("Иванов", "5555555");
        book.addPerson("Иванов", "2222222");
        book.addPerson("Петров", "1111111");
        book.findPerson("Иванов");
        book.findPerson("Петров");

    }
}