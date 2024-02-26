package kyu.six;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiplesOfThreeOrFive {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {

        int multipleOfThree = IntStream.range(0,number)
                                       .filter(num -> (num % 3 == 0) && (num % 5 != 0))
                                       .sum();
        int multipleOfFive = IntStream.range(0,number)
                                      .filter(num -> (num % 5 == 0) && (num % 3 != 0))
                                      .sum();
        int multipleOfThreeAndFive = IntStream.range(0,number)
                                              .filter(num -> (num % 5 == 0) && (num % 3 == 0))
                                              .sum();

        return multipleOfThreeAndFive + multipleOfFive + multipleOfThree;
    }
}
