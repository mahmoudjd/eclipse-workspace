package Exam1;

import java.util.*;

class X {
}

class Y extends X {
}

public class Exam4 {
    // Methode m: dazu gibt es gleich mehrere Varianten
    // private static void m(List< Object> list) FALSCH
    // {
    // }

    // private static void m(ArrayList<X> list)
    // {
    // }
    //
    // private static void m(List<? extends X> list)
    // {
    // }
    // private static void m(ArrayList<? extends X> list)
    // {
    // }
    // private static void m(List<? super X> list)
    // {
    // }
    //

    // private static void m(ArrayList<? super X> list)
    // {
    // }

    // private static void m(List<? super Y> list)
    // {
    // }

    private static void m(ArrayList<? super Y> list) {
    }

    public static void main(String[] args) {
        ArrayList<X> xL = new ArrayList<X>();
        ArrayList<Y> yL = new ArrayList<Y>();
        m(xL);
        m(yL);
    }
}