import java.util.*;
public class employee{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}

class employees {
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;;
    employees()
    {
        System.out.println("name:");
        Name= sc.next();
        System.out.println("Employee id:");
        empid= sc.nextInt();
        System.out.println("salary:");
        salary=sc.nextInt();
        System.out.println("address:");
        address=sc.next();
    }
}

class teacher extends employees{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher(){
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
    }
    void display()
    {
        System.out.println("Details are:");
	System.out.println("------------------");
        System.out.println(Name);
        System.out.println(empid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salary);
    }
}

output
------------
C:\Users\HP>cd Desktop

C:\Users\HP\Desktop>cd java

C:\Users\HP\Desktop\java>javac employee.java

C:\Users\HP\Desktop\java>java employee
Enter the limit:
2
name:
amalu
Employee id:
7
salary:
30000
address:
nechoor
Department name:
cs
Subject:
ds
Details are:
------------------
amalu
7
nechoor
ds
cs
30000
name:
anu
Employee id:
5
salary:
20000
address:
aluva
Department name:
mba
Subject:
maths
Details are:
------------------
anu
5
aluva
maths
mba
20000

C:\Users\HP\Desktop\java>

