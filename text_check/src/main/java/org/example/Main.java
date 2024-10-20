package org.example;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";
        text = text.toLowerCase().replaceAll("[^а-яё]", "");
        Set<Character> letters = new HashSet<>();
        for (char c : text.toCharArray()) {
            letters.add(c);
        }
        if (letters.size() == 33) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }
    }
}
