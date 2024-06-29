import java.util.*;

public class Anagramfinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        String str=tofind(word1);
        String str1=tofind(word2);
        if(str.equals(str1)){
            System.out.println(word1+" and "+word2+" are anagrams");
        }
        else{
            System.out.println(word1+" and "+word2+" are not Anagrams");
        }
    }
    public static String tofind(String word){
        String str="";
        char[] arr=new char[word.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=word.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            str=str+arr[i];
        }
        return str;
    }
}
