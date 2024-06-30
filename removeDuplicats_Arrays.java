import java.util.*;
public class removeDuplicats_Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,5,6,7,4,2,3};
        int index=0;
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean isthere=false;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr[i]){
                    isthere=true;
                    break;
                }
            }
            if(!isthere){
                arr1[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(arr1[i]);
        }
    }
}