package sort;
import sort.Util;
public class Quick{

    public static void sort(Comparable[] a){
        Util.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }


    private static int partition(Comparable[] a, int lo, int hi) {
    	int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) { 

            // find item on lo to swap
            while (Util.less(a[++i], v))
                if (i == hi) break;

            // find item on hi to swap
            while (Util.less(v, a[--j]))
                if (j == lo) break;      // redundant since a[lo] acts as sentinel

            // check if pointers cross
            if (i >= j) break;

            Util.exch(a, i, j);
        }

        // put partitioning item v at a[j]
        Util.exch(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
	}

	public static void main(String[] args){
        // int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        Character[] a = {'Q','U','I','C','K','S','O','R','T','E','X','A','M','P','L','E'};
        Util.show(a);
        sort(a);
        Util.show(a);

    }

}
