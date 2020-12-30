import java.util.*;
import java.util.Scanner;

class area{
    public static void main(String[] args) {
        Circle c=new Circle(2);
        double r=c.getRadius();
        c.setRadius(r);
        System.out.println("Area of Circle: "+c.getArea());
        Cylinder cy= new Cylinder(2,3);
        double h=cy.getHeight();
        cy.setHeight(h);
        System.out.println("Area of Cylinder: "+cy.getArea());
    }
}

class Cylinder extends Circle{
    Scanner in=new Scanner(System.in);
    double h;
    Cylinder(double r,double h){
        super(r);
    }
    public double getArea(){
        return ((2*Math.PI*r+h)+(2*Math.PI*r));
    }
    public double getHeight(){
        System.out.println("ENter height of cylinder: ");
        double h=in.nextDouble();
        return h;
    }
    public void setHeight(double h){
this.h=h;
    }
}
class Circle{
    Scanner in=new Scanner(System.in);
    double r;
    Circle(double r){
        this.r=r;
    }
    public double getArea(){
     return Math.pow(r,2)*Math.PI;
    }
    public void setRadius(double r){
        this.r=r;
    }

    public double getRadius() {
        System.out.println("Enter the radius: ");
        double r= in.nextDouble();
        return r;
    }
}