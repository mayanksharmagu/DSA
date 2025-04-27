package conditinals;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter width of rectangle: ");
        int w = sc.nextInt();
        int area = l * w;
        System.out.println("Area of rectanle : " + area);
        int perimeter = 2*(l*w);
        System.out.println("perimeter of rectangle : " + perimeter);

        if(area>perimeter) {
            System.out.println("area is greater");
        }
        if(area<perimeter) {
            System.out.println("perimeter is greater");
        }


    }
}