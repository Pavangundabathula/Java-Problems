import java.util.*;

public class commonelements_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of first array: ");
        int m=sc.nextInt();
        int[] arr=new int[m];
        arr=set_elements(arr,sc);
        System.out.print("Enter the length of Second array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        arr1=set_elements(arr1,sc);
        toprint(arr);
        toprint(arr1);
        commonelements(arr, arr1);
        System.out.println();
        toprint(arr1);
    }
    public static int[] set_elements(int[] arr1,Scanner sc){
        System.out.println("Enter elements: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        return arr1;
    }
    public static void toprint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void commonelements(int[] arr,int[] arr1){
        int[] org1=arr1;
        System.out.print("Common Elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    arr1[j]=0;
                    System.out.print(arr[i]+" ");
                }
            }
        }
        arr1=org1;
    }
}