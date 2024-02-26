package kyu.six;

import java.util.HashMap;

public class FindTheOddInt {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
    }

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> numericRepeat = new HashMap<>();
        for (int item : a) {
            if (numericRepeat.containsKey(item)) {
                numericRepeat.put(item, numericRepeat.get(item) + 1);
            } else {
                numericRepeat.put(item, 1);
            }
        }
        for (Integer key : numericRepeat.keySet()) {
            if (numericRepeat.get(key) % 2 == 1) {
                return key;
            }
        }
        return 0;
    }
}

 







