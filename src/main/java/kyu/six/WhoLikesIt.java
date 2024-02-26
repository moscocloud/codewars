package kyu.six;

import java.util.ArrayList;

public class WhoLikesIt {

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d like this", names[0], names[1], names.length - 2);
        }
    }
}
