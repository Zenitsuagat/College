import java.util.Scanner;

interface Shape{
    void area();
    void perimeter();
}

class Rectangle implements Shape{
    int a,b;
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void area(){
        System.out.println("Area : "+this.a*this.b);
    }
    public void perimeter(){
        System.out.println("Perimeter : "+ 2*(this.a+this.b));
    }
}

class Circle implements Shape{
    int x;
    Circle(int x){
        this.x = x;
    }
    public void area(){
        System.out.println("Area : "+(3.14*this.x*this.x));
    }
    public void perimeter(){
        System.out.println("Perimeter : "+ (2*3.14*this.x));
    }
}

class InterfaceShape{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        int l = input.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int w = input.nextInt();

        System.out.print("Enter the radius of circle : ");
        int r = input.nextInt();

        Rectangle obj = new Rectangle(l, w);
        System.out.println("Rectangle : ");
        obj.area();
        obj.perimeter();

        Circle obj1 = new Circle(r);
        System.out.println("Circle : ");
        obj1.area();
        obj1.perimeter();
    }
}