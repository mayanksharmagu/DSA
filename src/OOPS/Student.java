package OOPS;


public class Student {
    String name;
    private int rno;
    double percent;

    public Student(String naam , int roll , double per) {
       name = naam ;
       rno  = roll;
       percent = per;
    }

    public int getRno() { //getter
        return rno;
    }

    public void setRno(int rno) { //setter
        this.rno = rno;
    }

}