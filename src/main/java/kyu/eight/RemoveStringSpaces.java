package kyu.eight;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("asdas asd asd asd asdas  asd"));
    }
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
