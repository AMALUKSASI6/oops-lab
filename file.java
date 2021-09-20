import java.io.*;
import java.util.*;

public class file 
{
    public static void main(String args[]) throws Exception 
    {
        filhand f = new filhand();
        f.getname();
        f.writefil();
        f.readfil();
    }
}


class filhand{
    String fname;
    void getname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name (.text):");
        fname = sc.next();
    }
    void writefil() throws Exception{
        FileOutputStream fos = new FileOutputStream(fname);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("java programming...");
    }
    void readfil() throws Exception{
        FileInputStream fis = new FileInputStream(fname);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}

