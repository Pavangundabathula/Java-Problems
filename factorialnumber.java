import java.util.*;

public class factorialnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Factorial of Numbers");
        System.out.print("Enter a number to know Factorial of it: ");
        int i=sc.nextInt();
        int f=i;
        int result=1;
        while(i>0){
            result=result*i;
            i--;
        }
        System.out.println("The Factorial of "+f+" is: "+result);
    }
}
