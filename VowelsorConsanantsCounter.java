import java.util.*;

public class VowelsorConsanantsCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vowles Or Consanants Checker");
        System.out.print("Enter any word or sentence: ");
        String word=sc.nextLine();
        vowelscounter(word);
        
    }
    public static void vowelscounter(String word){
        int vowels=0;
        int consanants=0;
        int spaces=0;
    for(int i=0;i<word.length();i++){
        char c=word.charAt(i);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            vowels++;
        }
        else if(c==' '){
            spaces++;
        }
        else{
            consanants++;
        }
    }
        System.out.println("Vowels in "+word+" is: "+vowels);
        System.out.println("Consonants in "+word+" is: "+consanants);
        if(spaces>0){
            System.out.println("Spaces in the word is: "+spaces);
        }
    }
}
