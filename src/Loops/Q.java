package Loops;

public class Q {
    public static void main(String[] args) {
        int x= 5, y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+""+y);
        }
    }
}
