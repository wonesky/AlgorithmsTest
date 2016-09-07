package sort;


public  class Selection {
    public static void sort(int[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            int min = i;
            for(int j = i+1; j < N; j++){
                if(less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    private static boolean less(int a, int b){
        if(a < b) return true;
        else return false;
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
