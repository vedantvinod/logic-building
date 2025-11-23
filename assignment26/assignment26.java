import java.util.*;
class  pattern{
    public void display(int ino){
      int icnt=0;
      char ch='A';
        for (icnt= 0;icnt<ino;icnt++){

            System.out.print((char)('A'+icnt%26)+"\t" );

        }


    }


}

public class assignment26{

    public static void main(String a[]){

        int iValue=0;
         Scanner sobj= new Scanner(System.in);

         System.out.print("enter the number of alphabate u want to display:");

         iValue= sobj.nextInt();

         pattern pobj= new pattern();
         
         pobj.display(iValue);





    }
}