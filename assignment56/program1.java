// write the java program to take file name from user and open that file 
// neeed user input , copy that file 
import java.io.FileInputStream;

import java.util.Scanner;

import java.io.IOException;

public class program1 {
    public static void main (String Arr[])
    {  
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the name of file ");
        String Fname =sobj.nextLine();

        try 
        {
            FileInputStream fin = new FileInputStream(Fname);
            System.out.println("File opened successfully.");

            fin.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to open file.");
        }
        sobj.close();
    }
}
