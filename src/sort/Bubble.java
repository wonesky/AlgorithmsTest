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
    
    public static void sort2(int[] a) {
        int N = a.length;
        boolean swapped;
		do{
			swapped = false;
			for(int i = 0; i < N-1; i++){
				if(Util.less(a[i+1],a[i])){
					Util.exch(a, i, i+1);
					swapped = true;
				}
			}
			
		}while(swapped);
    }

    public static void main(String[] args){
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        Util.show(a);
        sort2(a);
        Util.show(a);

    }
}
