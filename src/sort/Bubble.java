package sort;

public class Bubble{
    public static void sort(int[] a) {
        int N = a.length;
        boolean swap;
        do{
            swap = false;
            for(int i = 1; i < N; i++){
                if(less(a[i], a[i-1])){
                    exch(a,i,i-1);
                    swap = true;
                }
            }
        }while(swap);

    }

    private static boolean less(int a, int b){
        return a < b? true:false;
    }

    private static void exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        show(a);
        sort(a);
        System.out.println(" ");
        show(a);

    }
}
