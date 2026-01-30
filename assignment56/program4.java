import java.io.*;
import java.util.*;

public class program4
{
    public static void main(String a[]) throws Exception
    {
        
        String dirname=null;

        System.out.println("enter the name of directory u are looking for ");

        Scanner sobj= new Scanner (System.in);

        dirname=sobj.nextLine();

        File fname= new File(dirname);

        if(fname.exists()&&fname.isDirectory())
        {
            File filist[]= fname.listFiles();

            System.out.println("the listed files in the folder are :");

            for (int i =0;i<filist.length;i++)
                {
                    System.out.println("filename:\t"+filist[i].getName()+"file size:\t"+filist[i].length()+"bytes");
                }

        }
        else
            {System.out.println("there is no such directory");}
        
        sobj.close();


    }
}