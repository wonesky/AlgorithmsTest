package sort;
import sort.Util;
public class Bubble{
    public static void sort(int[] a) {
        int N = a.length;
		for (int i = 0; i < N - 1; i++){
			for (int j = 0; j < N - 1 - i; j++){
				if (Util.less(a[j+1], a[j]))
					Util.exch(a, j, j+1);
            }
        }
    }

    public static void main(String[] args){
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        Util.show(a);
        sort(a);
        Util.show(a);

    }
}
