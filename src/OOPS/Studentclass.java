package OOPS;

public class Studentclass {
    //cretaing new data type
//    public static class Student{
//        String name;
//        int rno;
//        double percent;
//
//    }
    public static void main(String[] args) {
//         Student x = new Student(); //declaration
//         x.name ="mayank";
//         x.percent = 76;
//         x.rno= 21;
//        System.out.println(x.name);

        Student z = new Student("mayank", 76, 93);
//        z.name = "shivam";
//        z.percent = 87;
//        z.rno = 45;
        System.out.println(z.name);
    }
}
