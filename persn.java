import java.util.Scanner;

public class persn {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            tr[i].disp();
        }
    }
}

class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("------------------------");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        addres=sc.next();
        System.out.println("Gender:");
        gend=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("Empolyee Details");
	System.out.println("--------------------");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        emplid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salry=sc.nextInt();
    }
}
class tcher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int techrID;
    tcher(){
        System.out.println("Teacher Details : ");
	System.out.println("--------------------");
        System.out.println("Department name : ");
        dept=sc.next();
        System.out.println("Subject : ");
        subj= sc.next();
        System.out.println("Teahcer ID : ");
        techrID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("Details are : ");
	 System.out.println("-------------------------");
        System.out.println(name);
        System.out.println(gend);
        System.out.println(age);
        System.out.println(cmpny_name);
        System.out.println(emplid);
        System.out.println(qualification);
        System.out.println(techrID);
        System.out.println(addres);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salry);
    }
}


output
--------

C:\Users\HP>cd Desktop

C:\Users\HP\Desktop>cd java

C:\Users\HP\Desktop\java>javac persn.java

C:\Users\HP\Desktop\java>java persn
Enter the limit :
2
Person Details:
------------------------
Name:
Amalu
Address:
nechoor
Gender:
female
Age:
22
Empolyee Details
--------------------
Company Name:
tcs
Employee ID:
567
Qualification:
mca
Salary:
60000
Teacher Details :
--------------------
Department name :
cs
Subject :
ds
Teahcer ID :
56
Details are :
-------------------------
Amalu
female
22
tcs
567
mca
56
nechoor
ds
cs
60000
Person Details:
------------------------
Name:
