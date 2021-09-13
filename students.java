import java.util.*;

public class students
{
    public static void main(String args[])
    {
        result res = new result();
        res.get();
        res.displ();
    }
}



interface student
 {
    Scanner sc = new Scanner(System.in);
    int roll = 6, mark = 90;
    String name = "Amalu", classname = "MCA";

}



class sports
{
    Scanner sc = new Scanner(System.in);
    int marks;
    void get()
    {
        System.out.println("Enter marks out of 20:");
        marks=sc.nextInt();
    }
}



class result extends sports implements student
{
    void displ()
    {
        System.out.println("Details of students are:");
	 System.out.println("-------------------------------");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+marks);
    }
}


output
-------
C:\Users\HP>cd Desktop

C:\Users\HP\Desktop>cd java

C:\Users\HP\Desktop\java>javac students.java

C:\Users\HP\Desktop\java>java students
Enter marks out of 20:
13
Details of students are:
-------------------------------
Name:Amalu
Roll number:6
Class Name:MCA
Academic Mark:90
Sports Mark:13

C:\Users\HP\Desktop\java>