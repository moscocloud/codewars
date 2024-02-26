package kyu.seven;

public class DisemvowelTrolls {

    public static void main(String[] args) {
        System.out.println(disemvowel("antOn"));;
    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
