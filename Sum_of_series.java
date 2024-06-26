import java.util.*;

public class Sum_of_series {
    public static void main(String[] args) {
        System.out.println("Sum of Series: 1+1/2+1/3+........+1/n");
        double a=1.0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n of series: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            a=a+(double)1/i;
        }
        System.out.printf("%2f",a);
    }
}
