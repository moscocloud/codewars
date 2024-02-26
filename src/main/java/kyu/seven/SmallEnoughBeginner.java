package kyu.seven;

import java.util.Arrays;

public class SmallEnoughBeginner {
    public static void main(String[] args) {
        System.out.println(smallEnough(new int[] { 66, 222 }, 200));

    }
    public static boolean smallEnough(int[] a, int limit)
    {
        return Arrays.stream(a).filter(x -> x > limit).count() == 0;
    }
}
