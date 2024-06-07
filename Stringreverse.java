import java.util.*;

public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        System.out.println("Reverse of "+str+" is: "+s);
    }
}
