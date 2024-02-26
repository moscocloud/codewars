package kyu.eight;

import java.util.Arrays;

public class SumOfPositive {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,-2,3,4,5}));
    }
//    public static int sum(int[] arr){
//        int total = 0;
//        for(int i: arr){
//            total += i;
//        }
//        return total;
//    }

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(i -> i > 0).sum();
    }
}
