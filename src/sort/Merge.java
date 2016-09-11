package sort;
import sort.Util;

public class Merge{
    private static Comparable[] aux; //归并排序辅助数组
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length]; //一次性分配空间
        sort(a, 0, a.length - 1);

    }
    
    //自底向上的归并排序  logN次两两归并
    public static void sortBU(Comparable[] a){
    	int N = a.length;
    	aux = new Comparable[N];
    	for(int sz = 1; sz < N; sz += sz){  //sz为子数组大小
    		for(int lo = 0; lo < N - sz; lo += sz+sz){ //lo子数组索引
    			merge(a,lo,lo+sz-1, Math.min(lo+sz+sz-1, N-1));
    		}
    	}
    }
    
    private static void sort(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid); //左半边排序
        sort(a, mid+1, hi); //右半边排序
        merge(a, lo, mid, hi); //归并结果
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid +  1;
        //复制a[lo...hi]到aux[lo...hi]
        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        //归并回a[lo...hi]
        for(int k = lo; k <= hi; k++){
            if      (i > mid)              a[k] = aux[j++]; //左半边用尽取右半边元素
            else if (j > hi)               a[k] = aux[i++]; //右半边用尽取左半边元素
            else if (Util.less(aux[i],aux[j]))  a[k] = aux[i++]; //左半边的当前元素小于右半边的当前元素，取左半边的
            else                           a[k] = aux[j++]; //右半边的当前元素小于左半边的当前元素，取右半边的
        }
    }

    

    public static void main(String[] args){
        // int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        Character[] a = {'M','E','R','G','E','S','O','R','T','E','X','A','M','P','L','E'};
        Util.show(a);
        sortBU(a);
        System.out.println(" ");
        Util.show(a);

    }

}
