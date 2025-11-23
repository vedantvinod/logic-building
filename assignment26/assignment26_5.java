// 8
// 2 4 6 8 10 12 14 16 
// 1 2 3 4  5  6  7    8 

import java.util.*;


class  pattern{
    public void display(int ino){


        for (int icnt=1;icnt <=(2*ino);icnt++){
            if (icnt%2==0){
            System.out.print(icnt);
            }
            else {
                System.out.print("\t");
            }
            
        
    
    }
    }



}

public class assignment26_5{

    public static void main(String a[]){

        int iValue=0;
         Scanner sobj= new Scanner(System.in);

         System.out.print("enter the number :");

         iValue= sobj.nextInt();

         pattern pobj= new pattern();
         
         pobj.display(iValue);





    }
}