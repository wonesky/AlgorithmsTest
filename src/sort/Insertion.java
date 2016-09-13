package sort;
import sort.Util;
public class Insertion {

    public static void sort(int[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && Util.less(a[j], a[j-1]); j--)
            	Util.exch(a, j, j-1);
        }
    }
    public static void sort2(int[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0; j--){
            	if(Util.less(a[j], a[j-1]))
            		Util.exch(a, j, j-1);
            	else
            		break;
            }
            	
        }
    }
    public static void main(String[] args){
         int[] a = {3, 4, 5, 18, 15,47, 36, 26, 27, 2, 46, 44, 19, 50, 48};

        //Character[] a = {'H','E','L','L','O'};
        Util.show(a);
        sort(a);
        Util.show(a);

    }

}
