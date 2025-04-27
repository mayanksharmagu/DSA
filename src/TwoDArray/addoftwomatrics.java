package TwoDArray;

public class addoftwomatrics {
    public static void main(String[] args) {
        int[][] a = {{1, 4, 2}, {6, 7, 4}, {6, 7, 5}};
        int[][] b = {{7, 6, 4}, {7, 9, 7}, {6, 7, 8}};
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
