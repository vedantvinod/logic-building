
import java.io.FileOutputStream;

import java.util.Scanner;

import java.io.IOException;

public class program3 {
    public static void main (String Arr[])
    {  
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the name of file ");
        String Fname =sobj.nextLine();

        try 
        {
            FileOutputStream fout = new FileOutputStream(Fname,true );
            System.out.println("File opened successfully.");

            String data="hello world ";
            fout.write(data.getBytes());
            fout.close();

            System.out.println("File opened in write mode and data written.");
        }
        catch(IOException e)
        {
            System.out.println("Unable to open file.");
        }
        sobj.close();
    }
}
