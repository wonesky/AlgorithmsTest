package sort;
import sort.Util;

public  class Selection {
    public static void sort(int[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            int min = i;
            for(int j = i+1; j < N; j++){
                if(Util.less(a[j], a[min])) min = j;
            }
            Util.exch(a, i, min);
        }
    }


    public static void main(String[] args){
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        Util.show(a);
        sort(a);
        Util.show(a);

    }

}
