import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={2,9,3,5,2};
        bs(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
    public static void bs(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    
}
