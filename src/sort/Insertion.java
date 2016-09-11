package sort;
import sort.Util;
public class Insertion {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && Util.less(a[j], a[j-1]); j--)
            	Util.exch(a, j, j-1);
        }
    }

    public static void main(String[] args){
        // Integer[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        Character[] a = {'H','E','L','L','O'};
        Util.show(a);
        sort(a);
        Util.show(a);

    }

}
