package de.predic8;

public class Utils {

    public static String stripQuotes(String s) {
        return s.replaceAll("^\"","").replaceAll("\"$","");
    }
}
