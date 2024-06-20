import java.util.*;

public class harshadnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Harshad Number");
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int org=num;
        int result=0;
        while(num>9){
            int temp=num%10;
            result=result+temp;
            num=num/10;
        }
        result=result+num;
        if(org%result==0){
            System.out.println(org+" is an Harshad Number");
        }
        else{
            System.out.println(org+" is not an Harshad Number");
        }
    }
}
