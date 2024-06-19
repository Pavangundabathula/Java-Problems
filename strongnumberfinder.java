import java.util.*;

public class strongnumberfinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Strong Number Finder");
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int org=num;
        int result=0;
        int re;
        while(num>=10){
            int temp=num%10;
            re=factorial(temp);
            result=result+re;
            num=num/10;
        }
        re=factorial(num);
        result=result+re;
        if(result==org){
            System.out.println(org+" is an Strong Number");
        }
        else{
            System.out.println(org+" is not an Strong Number");
        }
    }
    public static int factorial(int num){
        int result=1;
        for(int i=1;i<=num;i++){
            result=result*i;
        }
        return result;
    }
}