import java.util.*;
  class student
{
    long rollNo;
    String name;
    String course;
    int m1,m2,m3;
    public String toString()
    {
        return "rollNo:"+rollNo+"\n"+"name:"+name+"\n"+"course:"+course+"\n";
    }

    public float total()
    {
        return m1+m2+m3;
    }

   public float average()
    {
        return total()/3f;
    }
    public char grade()
    {
        if(average()>=90&&average()<=100)
        {
            return 'A';
        }
        else if(average()<90&&average()>=60)
        {
            return 'B';
        }
        else{
            return 'C';
        }
    }
}
 class studentTest
{
    public static void main(String args[])
    {
        student s=new student();
        s.rollNo=23456;
        s.name="LATHEESH";
        s.course="JAVA";
        s.m1=70;
        s.m2=90;
        s.m3=50;
        System.out.println("DETAILS:"+"\n"+s);
        System.out.println("total: "+s.total());
        System.out.println("average: "+s.average());
        System.out.println("grade "+s.grade());
    }
}