package TwoDArray;

public class transpose {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,5},{4,7}};
        int m = arr.length;
        int n = arr[0].length;
        System.out.println();
        int [][] transpose = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
