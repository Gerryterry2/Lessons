package Lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> phonebook;
    public Phonebook() {
        this.phonebook = new HashMap<>();
    }
    public void addPerson(String surname, String phone) {
        HashSet<String> book = phonebook.getOrDefault(surname, new HashSet<>());
        book.add(phone);
        phonebook.put(surname, book);
    }

    public void findPerson (String surname) {
        System.out.println(surname  + phonebook.getOrDefault(surname, new HashSet<>()));
    }
}



