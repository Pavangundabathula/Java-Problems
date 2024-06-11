import java.util.*;

public class number_into_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Integer to Binary number\n2.Binary to Integer");
        System.out.print("Enter ur Choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the number: ");
                int number=sc.nextInt();
                String binary=Integer.toBinaryString(number);
                System.out.println(number+"in binary is: "+binary);
                break;
            case 2:
                sc.nextLine();
                System.out.print("Enter Binary number: ");
                String binary1=sc.nextLine();
                binarytoint(binary1);
            default:
                System.out.println("Enter Valid choice.");
                break;
        }
        
    }
    static void binarytoint(String binary1){
        int result=0;
        int length=0;
        for(int i=binary1.length()-1;i>=0;i--){
            char c=binary1.charAt(i);
            if(c=='1'){
                result+=Math.pow(2,length);
            }
            length++;
        }
        System.out.println(binary1+" in number is: "+result);
    }
}
