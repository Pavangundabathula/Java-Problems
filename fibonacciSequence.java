import java.util.*;

public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fibonacci Sequence");
        System.out.print("Enter number of values you want to know in Fibonacci Sequence: ");
        int i=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" , "+second);
        while(i>2){
            int temp=first+second;
            first=second;
            second=temp;
            System.out.print(" , "+temp);
            i--;
        }
    }
}
