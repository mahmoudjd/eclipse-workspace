package Exam1;

import java.util.*;

public class Aufgabe5 {

    Set<String> authorizedPersonnelIds = new HashSet<String>();

    @SuppressWarnings("unused")
    private boolean hasAccess(String key) {

        if (authorizedPersonnelIds.contains(key))
            return true;
        return false;
    }

    private void purgeOutdatedPersonnelIds(Set<String> s) {
        authorizedPersonnelIds.retainAll(s);

    }

    public static void main(String[] args) {
        Aufgabe5 a = new Aufgabe5();
        a.authorizedPersonnelIds.add("11");
        a.authorizedPersonnelIds.add("12");
        a.authorizedPersonnelIds.add("13");
        Aufgabe5 b = new Aufgabe5();

        b.authorizedPersonnelIds.add("12");
        b.authorizedPersonnelIds.add("13");
        a.purgeOutdatedPersonnelIds(b.authorizedPersonnelIds);
        for (String s : a.authorizedPersonnelIds) {
            System.out.println(s);
        }

    }
}
