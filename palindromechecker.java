import java.util.*;
public class palindromechecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Palindrome checker");
        System.out.print("Enter the word or number : ");
        String str=sc.nextLine();
        String newstr="";
        for(int i=str.length()-1;i>=0;i--){
            newstr=newstr+str.charAt(i);
        }
        System.out.println(newstr);
        if(str.equals(newstr)){
            System.out.println(str+" is palindrome ");
        }
        else{
            System.out.println(str+" is not a Palindrome");
        }
    }
}