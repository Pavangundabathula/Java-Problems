import java.util.*;

class EvenorOddChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Even or Odd Number Checker");
        System.out.print("Enter number: ");
        int i=sc.nextInt();
        if(checker(i)){
            System.out.println(i+" is Even Number");
        }
        else{
            System.out.println(i+" is Odd Number");
        }
    }
    public static boolean checker(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}