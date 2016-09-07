package sort;

public class Shell{
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3) h = h * 3 + 1;
        while(h >= 1){
            for(int i = 1; i < N; i++){
                for(int j = i; j >= h && less(a[j],a[j-h]); j -= h)
                    exch(a, j, j-h);
            }
            h = h / 3;
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
        // int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        
        Character[] a = {'S','H','E','L','L','S','O','R','T','E','X','A','M','P','L','E'};
        show(a);
        sort(a);
        System.out.println(" ");
        show(a);

    }


}
