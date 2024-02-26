package kyu.seven;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareEveryDigit {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        return Integer.parseInt(
                Arrays.stream(String.valueOf(n).split(""))
                        .map(item -> String.valueOf((int)(Math.pow(Double.parseDouble(item),2))))
                        .collect(Collectors.joining(""))
        );
    }
}
