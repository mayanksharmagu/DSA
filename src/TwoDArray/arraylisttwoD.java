import java.util.ArrayList;
import java.util.List;

public class arraylisttwoD {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(90); b.add(80);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(10); c.add(20);
        ArrayList<Integer> d = new ArrayList<>();

        List<List<Integer>> n = new ArrayList<>();
        n.add(a); n.add(b); n.add(c); n.add(d);

        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i) + " ");}
//        for (int i = 0; i < n.size(); i++)
//             for (int j = 0; j < n.get(i).size(); j++) {
//                 System.out.print(n.get(i).get(j)+" ");
//             }
             System.out.println();
        }
    }


