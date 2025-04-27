package string;

public class tolowercaseandconcat {
    public static void main(String[] args) {
        String S = "Raghav Garg is 24 year old";
        String R = "is teacher";
        System.out.println(S.toLowerCase());

        System.out.println(S.toUpperCase());

        System.out.println(S.concat(R));

        //to permanent store make a element and store them into a element
        S = S.concat(R);
        System.out.println(S);
    }
}
