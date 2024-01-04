package de.predic8.maxage;

import java.util.*;

public class Faktorisierung {

    public static Ergebnis zerlege(long n) {
        var f = new ArrayList<Long>();
        for (long i = 2; i <= n;) {
           if (n % i == 0) {
               n = n / i;
               f.add(i);
               continue;
           }
           i++;
        }
        return new Ergebnis(f);
    }
}
