package string;

public class DeleteandInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abngc");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(2,"b");
        System.out.println(sb);
    }
}
