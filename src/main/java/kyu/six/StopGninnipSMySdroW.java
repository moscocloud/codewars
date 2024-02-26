package kyu.six;

import java.util.Arrays;

public class StopGninnipSMySdroW {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }
    public static String spinWords(String sentence) {
        StringBuilder resultStr = new StringBuilder();
        String[] arrayString = sentence.split(" ");
        for (String str:arrayString) {
            if (str.length() >= 5) {
                resultStr.append(new StringBuilder(str).reverse()).append(" ");
            } else {
                resultStr.append(str).append(" ");
            }
        }
        return resultStr.toString().trim();
    }
}
