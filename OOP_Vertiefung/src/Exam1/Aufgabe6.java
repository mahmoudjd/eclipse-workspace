package Exam1;

import java.util.*;

class Artist {
    private String key;

    private Set<String> keys = new TreeSet<>();

    public Artist(String key) {
        this.key = key;
        keys.add(key);

    }

    public String getKey() {
        return key;
    }

    public Set<String> getKeys() {
        return keys;
    }

}

class Song {
    public int getRating() {
        return 0;
    }
}

class Musik {
    @SuppressWarnings("unused")
    private Map<Artist, List<Song>> songsByArtists = new HashMap<>();
}

public class Aufgabe6 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Artist a3 = new Artist("z3ouba");
        Artist a1 = new Artist("kozy");
        Artist a2 = new Artist("mesho");
        Artist a4 = new Artist("s");

        Map<Artist, Integer> list = new TreeMap<>(new Comparator<Artist>() {

            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getKey().compareTo(o2.getKey());
            }

        });

        list.put(new Artist("Ahmad"), 1);

        list.put(new Artist("Soso"), 1);

        list.put(new Artist("Mahmoud"), 1);

        list.put(new Artist("Zo3bi"), 1);

        for (Artist a : list.keySet()) {
            System.out.println(a.getKey());
            
            
            
            
        }
    }
}
