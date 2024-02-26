package kyu.seven;

import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
    }
    public static String oddOrEven (int[] array) {
       return Arrays.stream(array).sum() % 2 == 1 ? "odd" : "even";
    }
}
