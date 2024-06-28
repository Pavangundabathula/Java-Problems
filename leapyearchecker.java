import java.util.*;


public class leapyearchecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%4==0){
            System.out.println(i+" is an Leap Year");
        }
        else{
            System.out.println(i+" is not an Leap Year");
        }
    }   
}
