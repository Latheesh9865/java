import java.util.*;
class Rectangle
{
    private double length;
    private double breadth;
    public Rectangle()
    {
        setLength(1);
        setBreadth(1);
    }
    public Rectangle(double l,double b)
    {
        setLength(l); 
        setBreadth(b);
    }
    double getLength()
    {
        return length;
    }
    double getBreadth()
    {
        return breadth;
    }
    void setLength(double l)
    {
        length=l;
    }
    void setBreadth(double b)
    {
        breadth=b;
    }

    public double area()
    {
       return length*breadth;
    }
}
     class RectangleTest1
    {
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        System.out.println(r.area());
    }

    }
