import java.util.*;

interface calculate{
    public void area();
    public void perimeter();
};
class Circle implements calculate{
    double radius=0.0;
    Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        double areac=Math.PI*(radius*radius);
        System.out.printf("The Area of Cirlce is: %.2f\n",areac);
    }
    public void perimeter(){
        double perimeterc=2*Math.PI*radius;
        System.out.printf("The Perimeter of Circle is: %.2f",perimeterc);
    }
}
class Rectangle implements calculate{
    int height;
    int breadth;
    Rectangle(int height,int breadth){
        this.height=height;
        this.breadth=breadth;
    }
    public void area(){
        int arear=(height*breadth);
        System.out.println("The Area of Rectangle is: "+arear);
    }
    public void perimeter(){
        int perimeterr=2*(height +breadth);
        System.out.println("The Perimeter of Recatngle is: "+perimeterr);
    }
}
class Square implements calculate{
    int side;
    Square(int side){
        this.side=side;
    }
    public void area(){
        int area=side*side;
        System.out.println("The Area of Square is: "+area);
    }
    public void perimeter(){
        int perimeter=4*side;
        System.out.println("The Perimeter of Square is: "+perimeter);
    }
}
class Triangle implements calculate{
    int a,b,c;
    double height,breadth;
    Triangle(int a,int b,int c, double height,double breadth){
        this.a=a;
        this.b=b;
        this.c=c;
        this.height=height;
        this.breadth=breadth;
    }
    public void area(){
        double areat=(height*breadth)/2;
        System.out.printf("The Area of Triangle is: %.2f\n",areat);
    }
    public void perimeter(){
        int perimeter=a+b+c;
        System.out.println("The Perimeter of Triangle is: "+perimeter);
    }
}

public class AreaperimeterFinder {
    public static void main(String[] args) {
        System.out.println("List of Shapes"+"\n"+"1.Circle"+"\n"+"2.Rectangle"+"\n"+"3.Square"+"\n"+"4.Triangle");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius: ");
                double radius=sc.nextDouble();
                Circle obj=new Circle(radius);
                obj.area();
                obj.perimeter();
                break;
            case 2:
                System.out.print("Enter the height: ");
                int height=sc.nextInt();
                System.out.print("Enter the breadth: ");
                int breadth=sc.nextInt();
                Rectangle obj1=new Rectangle(height, breadth);
                obj1.area();
                obj1.perimeter();
                break;
            case 3:
                System.out.print("Enter the side: ");
                int side=sc.nextInt();
                Square obj2=new Square(side);
                obj2.area();
                obj2.perimeter();
                break;
            case 4:
                System.out.print("Enter the length of side a : ");
                int a=sc.nextInt();
                System.out.print("Enter the length of side b : ");
                int b=sc.nextInt();
                System.out.print("Enter the length of side c : ");
                int c=sc.nextInt();
                System.out.print("Enter the Height: ");
                double heightt=sc.nextDouble();
                System.out.print("Enter the breadth: ");
                double breadtht=sc.nextDouble();
                Triangle obj3=new Triangle(a, b, c, heightt, breadtht);
                obj3.area();
                obj3.perimeter();
            default:
                System.out.println("Select the correct option");
                break;
        }
    }
}
