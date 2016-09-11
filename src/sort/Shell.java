package sort;
import sort.Util;
public class Shell{
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3) h = h * 3 + 1;
        while(h >= 1){
            for(int i = 1; i < N; i++){
                for(int j = i; j >= h && Util.less(a[j],a[j-h]); j -= h)
                	Util.exch(a, j, j-h);
            }
            h = h / 3;
        }

    }


    public static void main(String[] args){
        // int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        
        Character[] a = {'S','H','E','L','L','S','O','R','T','E','X','A','M','P','L','E'};
        Util.show(a);
        sort(a);
        Util.show(a);

    }


}
