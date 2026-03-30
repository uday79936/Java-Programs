package day8;

public class TrimmedTheString {
    public static void main(String[] args) {

        String s = "   welcome   ";

        System.out.println("Before Trimming: " + s.length());
        System.out.println("After Trimming: " + s.trim().length());
    }
}