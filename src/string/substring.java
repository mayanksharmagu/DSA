package string;

public class substring {
    public static void main(String[] args) {
    String s = "abcde";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(1,4));
//        String a = ""; //null string

        //print all substring
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < 5; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }

    }
}
