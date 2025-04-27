package TwoDArray;

public class spiralprint {
    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        int[][] arr = {{4, 2, 7,67,8}, {5, 4, 9,98,4}, {3, 6, 8,78,6}};
        int m = arr.length, n = arr[0].length;
        print(arr);

        //spiral print
        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;
        while(minr<=maxr && minc<=maxc){
            //left to right
            for (int j =minc ; j <= maxc; j++) {
                System.out.print(arr[minr][j]+" ");
            } minr++;
            //top to bottom
            if (minr > maxr || minc > maxc) break;
            for (int i = minr; i <=maxr; i++) {
                System.out.print(arr[i][maxc]+" ");
            } maxc--;
            //right to left
            if (minr > maxr || minc >maxc) break;
            for (int j =maxc ; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            } maxr--;
            //bottom to top
            if (minr > maxr || minc >maxc) break;
            for (int i = maxr; i >= minr ; i--) {
                System.out.print(arr[i][minc]+" ");
            } minc++;
        }
    }
}
