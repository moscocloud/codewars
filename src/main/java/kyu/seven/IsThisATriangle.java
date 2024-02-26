package kyu.seven;

public class IsThisATriangle {
    public static void main(String[] args) {

    }


    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a) {
            return true;
        } else {
            return false;
        }
    }
}
