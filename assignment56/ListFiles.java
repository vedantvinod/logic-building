import java.io.File;
import java.util.Scanner;

public class ListFiles
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory path:");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            String files[] = dir.list();

            System.out.println("\nFiles in directory:\n");

            for(String name : files)
            {
                System.out.println(name);
            }
        }
        else
        {
            System.out.println("Invalid directory path.");
        }

        sobj.close();
    }
}