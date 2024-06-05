import java.util.*;

public class armstrongnumberChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Palindrome Number Checker");
        System.out.print("Enter the number: ");
        int i=sc.nextInt();
        int o=i;
        int result=0;
        while(i>10){
            int temp=i%10;
            i=i/10;
            result=result+(temp*temp*temp);
        }
        if(i<10){
            result=result+(i*i*i);
        }
        if(o==result){
            System.out.println(o+" is Armstrong Number");
        }
        else{
            System.out.println(o+" is not a ArmStrong number");
        }
    }
}
