// write the java program to take file name from user and open that file 
// neeed user input , copy that file 
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Scanner;

import java.io.IOException;

public class program2 {
    public static void main (String Arr[])
    {  
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter the name of file ");
        String source =sobj.nextLine();

        

        System.out.println("enter the name of file ");
        String desti =sobj.nextLine();

        try 
        {
            FileInputStream fin = new FileInputStream(source);
            System.out.println("File opened successfully.");

            FileOutputStream fout= new FileOutputStream(desti);
            int ch;

            System.out.println("\nFile contents:\n");

            while((ch = fin.read()) != -1)
                {
                    // display on screen
                    System.out.print((char)ch);
    
                    // copy into destination file
                    fout.write(ch);
                }

            fin.close();
            fout.close();
            System.out.println("\n\nFile copied successfully.");

           
        }
        catch(IOException e)
        {
            System.out.println("operation is failed ");
        }
        sobj.close();
    }
}
