package string;

public class modifycharacterInString {
    public static void main(String[] args) {
        String s = " hello";
        //heylo
        //2nd index change to y
        s=s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
