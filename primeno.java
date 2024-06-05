import java.util.*;

public class primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Prime or Composite Number Checker");
        System.out.print("Enter number to check: ");
        int number=sc.nextInt();
        int count=1;
        if(number==0 || number==1){
            System.out.println(number+" is neither prime number nor composite number ");
        }
        else{
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    count++;
                }
            }
        }
        if(count==1 || count==2){
            System.out.println(number+" is Prime Number");
        }
        else{
            System.out.println(number+" is Composite Number");
        }
    }
}
