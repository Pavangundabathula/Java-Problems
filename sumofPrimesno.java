import java.util.*;

public class sumofPrimesno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculate Sum of Prime numbers upto n");
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(i<4){
                sum+=i;
            }
            else{
                if(check_primes(i)){
                    sum+=i;
                }
            }
        }
        System.out.println("Sum is: "+sum);
    }
    public static boolean check_primes(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
            }
        }
        return prime;
    }
}
