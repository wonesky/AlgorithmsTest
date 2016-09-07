package sort;

import java.util.Comparator;
public class Insertion {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    // private static boolean less(int a, int b){
    //     return a < b? true:false;
    // }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // private static void exch(int[] a, int i, int j){
    //     int temp = a[i];
    //     a[i] = a[j];
    //     a[j] = temp;
    // }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // private static void show(int[] a) {
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.print(a[i]+" ");
    //     }
    // }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args){
        // Integer[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        Character[] a = {'H','E','L','L','O'};
        show(a);
        sort(a);
        System.out.println(" ");
        show(a);

    }

}
