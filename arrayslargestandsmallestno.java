import java.lang.reflect.Array;
import java.util.*;

public class arrayslargestandsmallestno{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=arr[0];
        int o=arr[0];
        for(int i=1;i<n;i++){
            if(m>arr[i]){
                m=arr[i];
            }
            if(o<arr[i]){
                o=arr[i];
            }
        }
        System.out.println("The Largest number: "+o);
        System.out.println("The Smallest number: "+m);
        String[] arr1={"a","p","j","e","g"};
        String str=" ";
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}