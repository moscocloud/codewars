package kyu.six;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }

    public static int digital_root(int n) {
        int total = n;
        while (true) {
             total = sum(total);
             if (total < 10) return total;
        }
    }

    public static int sum(int n) {
        return Integer.parseInt(
                Arrays.stream(String.valueOf(n)
                                .split(""))
                        .map(item -> Integer.parseInt(item))
                        .reduce(Integer::sum)
                        .map(item -> String.valueOf(item))
                        .stream().collect(Collectors.joining(""))
        );
    }
}

