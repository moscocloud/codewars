package kyu.eight;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("P Favuzzi"));
    }
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(str -> str.substring(0,1)
                        .toUpperCase())
                .collect(Collectors.joining("."));
    }
}
