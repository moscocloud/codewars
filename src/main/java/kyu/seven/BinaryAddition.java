package kyu.seven;

public class BinaryAddition {
    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 2)
        );
    }

    public static String binaryAddition(int a, int b) {
        //your code here
        return Integer.toBinaryString(a+b);
    }
}
