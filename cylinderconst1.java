import java.util.*;
class cylinderconst
{
    private int radius;
    private int height;
    public cylinderconst()
    {
        setRadius(1);
        setHeight(1);
    }
    public cylinderconst(int r,int h)
    {
        setRadius(r);
        setHeight(h);
    }
    public cylinderconst(int s)
    {
        setRadius(s);
        setHeight(s);
    }
    int getRadius()
    {
        return radius;
    }
    int getHeight()
    {
        return height;
    }
    void setRadius(int r)
    {
        radius=r;
    }
    void setHeight(int h)
    {
        height=h;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }

}
class cylinderconst1
{
    public static void main(String args[])
    {
        cylinderconst c=new cylinderconst(5,6);
        cylinderconst c=new cylinderconst();
        cylinderconst c=new cylinderconst(5);
        System.out.println("area of cylinder: "+c.area());
    }
}