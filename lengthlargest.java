import java.util.*;

public class lengthlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        int length=0;
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i==0){
                length=arr[i].length();
            }
            if(length<arr[i].length()){
                length=arr[i].length();
            }
        }
        System.out.println(length);
    }
}
