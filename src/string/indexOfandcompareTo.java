package string;

import java.sql.SQLOutput;

public class indexOfandcompareTo {
    public static void main(String[] args) {
        //indexOf()
        String s = "Mayank Sharma";
        System.out.println(s.indexOf('k'));
        System.out.println(s.lastIndexOf('a'));

        String a = "abc";
        String b = "nds";
        System.out.println(a.compareTo(b));
    }
}
