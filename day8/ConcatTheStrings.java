package day8;

public class ConcatTheStrings {
    public static void main(String[] args){
        String s1 = ("Welcome");
        String s2 = (" To Java Programing ");
        String s3 = ("Automation");

        System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2 + s3));
		
    }
}
