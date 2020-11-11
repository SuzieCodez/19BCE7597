import java.util.Scanner;
class mail{
    public static void main(String [] args){
        Ellipse e=new Ellipse();
        System.out.println("Enter the dimensions of Major and Minor axis");
        e.setDimensions();
        System.out.println("Area of Ellipse: "+e.area());
        Rectangle r=new Rectangle();
        System.out.println("Enter the dimensions of length and breadth");
        r.setDimensions();
        System.out.println("Area of Rectangle: "+r.area());
        Square s=new Square();
        System.out.println("Enter the dimensions of square(legth & breadth");
        s.setDimensions();
        System.out.println("Area of Square: "+s.area());
    }
}
interface GeometricFigure{
    abstract double area();
    abstract void setDimensions();
}
class Ellipse implements GeometricFigure{
    int a,b;

    @java.lang.Override
    public void setDimensions() {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }

    @java.lang.Override
    public double area() {
        return Math.PI*a*b;
    }
}
class Rectangle implements GeometricFigure{
   public int a,b;
    @java.lang.Override
    public void setDimensions() {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }

    @java.lang.Override
    public double area() {
        return a*b;
    }
}
class Square extends Rectangle{
    @java.lang.Override
    public double area() {
        return Math.pow(a,2);
    }

    @java.lang.Override
    public void setDimensions() {
        super.setDimensions();
    }
}