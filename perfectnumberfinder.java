import java.util.*;

public class perfectnumberfinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pnum=sc.nextInt();
        double b=Math.sqrt(pnum);
        if(b==Math.round(b)){
            System.out.println(pnum+" is a Perfect Square");
        }
        else{
            System.out.println(pnum+" is not a Perfect Square");
        }
    }
}
