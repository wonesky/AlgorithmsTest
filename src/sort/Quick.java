package sort;
import sort.Util;
public class Quick{

    public static void sort(Comparable[] a){
        Util.shuffle(a);  //打乱原数组，消除对输入的影响
        sort3way(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(a, lo, hi); //切分
        sort(a, lo, j-1);             //将左半部分a[lo...j-1]排序
        sort(a, j+1, hi);             //将右半部分a[j+1...hi]排序
    }
    
    private static void sort3way(Comparable[] a, int lo, int hi){
        if(hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while(i <= gt){
        	int cmp = a[i].compareTo(v);
        	if      (cmp < 0) Util.exch(a,lt++,i++);
        	else if (cmp > 0) Util.exch(a,i,gt--);
        	else    i++;
        	
        }
        sort3way(a,lo,lt-1);
        sort3way(a,gt+1,hi);
        
    }


    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;  //左侧扫描指针
        int j = hi + 1; //右侧扫描指针
        Comparable v = a[lo];  //切分元素
        while (true) {

            // 从左向右扫描，找到需要交换的元素
            while (Util.less(a[++i], v))
                if (i == hi) break;

            // 从右向左扫描，找到需要交换的元素
            while (Util.less(v, a[--j]))
                if (j == lo) break;      

            // 检查两个指针是否相遇
            if (i >= j) break;

            Util.exch(a, i, j);
        }

        // 将v=a[j]放到正确的位置
        Util.exch(a, lo, j);

        // 完成 a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
	}

	public static void main(String[] args){
         //int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        Character[] a = {'Q','U','I','C','K','S','O','R','T','E','X','A','M','P','L','E'};
        Util.show(a);
        sort(a);
        Util.show(a);

    }

}
