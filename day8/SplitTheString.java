package day8;

public class SplitTheString {

    public static void main(String[] args) {

        String s = "abc@gmail.com";

        String[] a = s.split("@");

        System.out.println(a[0]);
        System.out.println(a[1]);

        // Note: split() uses regex, so some special characters (*, ., ^, (, )) need escaping
    }
}