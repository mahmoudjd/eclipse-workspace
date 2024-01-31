package kapital10;

import java.util.*;

public class Aufgabe9 {

	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String Test = "In dieser Aufgabe sollen Sie eine HashMap<String, Integer> verwenden, um das Vorkommen von Wörtern"
        		+ "zu zählen (die Bedeutung von Schlüssel und Wert sollte klar sein). Schreiben Sie eine statische Methode"
        		+ "count mit der Map und dem zu zählenden Wort als Parameter! Wenn die Methode\r\n"
                + "count mit diesem Wort zum ersten Mal aufgerufen wird, dann soll ein neuer Eintrag in der Map für\r\n"
                + "dieses Wort mit dem Vorkommen eins hinzugefügt werden. Andernfalls soll der bisherige Wert für\r\n"
                + "dieses Wort um eins erhöht werden. Die einzigen Map-Methoden, die Sie in der Methode count\r\n"
                + "verwenden dürfen, sind computeIfAbsent und computeIfPresent";
        String[] words = Test.split(" ");
        for (String word : words) {
            count(map, word);
        }
        System.out.println(map);
    }

    static void count(HashMap<String, Integer> num, String word) {
        num.computeIfAbsent(word, (key) -> 0);
        num.computeIfPresent(word, (key, value) -> value + 1);
    }
}
