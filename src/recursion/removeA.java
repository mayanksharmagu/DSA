package recursion;

public class removeA {
    public static void print(int i, String s,String ans) {
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if( s.charAt(i)!='a') ans+=s.charAt(i);
        print (i+1,s,ans);
    }
    public static void main(String[] args) {
        String s ="Mayank";
        print(0,s," ");
    }
}
