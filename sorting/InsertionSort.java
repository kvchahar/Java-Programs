package sorting;

public class InsertionSort {
    public static void main(String[] args) {


        int[] a = {0,10, 98, 23, 55, 14};
        int i,n=5;
        System.out.println("unsorted array " );
        for (i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        int temp, j;
        for (i = 1; i <= n; i++) {
            temp = a[i];
            j = i - 1;
            while (temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        System.out.println("\n The sorted array is : ");
        for (i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
