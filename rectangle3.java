import java.util.*;
class rectangle2
{
    private double length;
    private double breadth;
    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public double getBreadth()
    {
        return length;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }
    public void area()
    {
       double a;
        a=length*breadth;
        System.out.println("area:"+a);
       
    }
    public void perimeter()
    {
        double p= 2*(length+breadth);
        System.out.println("perimeter: "+p);
    }
    public boolean issquare()
    {
        return  length==breadth;
    }
}
class rectangle3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        rectangle2 r1=new rectangle2();
        r1.setLength(5.6);
        r1.setBreadth(1.1);
       r1.area();
       r1.perimeter();
       System.out.println(r1.issquare());
       System.out.println(r1.getLength());
       System.out.println(r1.getBreadth());
    }

}