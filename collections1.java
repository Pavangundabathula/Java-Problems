import java.util.*;

class Person
{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        String m=("Name is: "+name+"\nAge is: "+age);
        return m;
    }
}
public class collections1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> person=new ArrayList<>();
        System.out.print(" 1.Add \n 2.Remove \n 3.Display all \n 4.Search");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                String name=sc.nextLine();
                

        }
    }
    public void toprint(List<Person> person){
        for (Person employee : person) {
            System.out.println(employee);
        }
    }
}
