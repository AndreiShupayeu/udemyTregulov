package home_work18;

import java.util.Arrays;

public class ArraySort {
    public static int[] sortirovka(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int k;
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }
        return a;
    }

    public static void showArray(int[][] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print("{");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                if (j == a[i].length - 1 && i != a.length - 1) {
                    System.out.print("},");
                } else if (j == a[i].length - 1) {
                    System.out.print("}");
                }
            }
        }
        System.out.print("}");
    }

    public static void showArray1(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] a = {6, 5, 3, 90, 2, 8};
        System.out.println(Arrays.toString(sortirovka(a)));

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        showArray(matrix);
//        System.out.println();
//        showArray1(matrix);
    }


}
