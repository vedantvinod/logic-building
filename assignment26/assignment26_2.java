// 5
// 5 # 4 # 3 # 2 # 1 #
// 1 2 3 4 5 6 7 8 9 10

import java.util.*;


class  pattern{
    public void display(int ino){
      int icnt=0;

      int icount=0;
      icount= ino;

      for (icnt =1;icnt<=2*ino;icnt++){

        if (icnt%2!=0){
            System.out.print(icount+"\t");
            icount--;

        }
        else {
            System.out.print("#"+"\t");


        }
        

      }
     

    }


}

public class assignment26_2{

    public static void main(String a[]){

        int iValue=0;
         Scanner sobj= new Scanner(System.in);

         System.out.print("enter the number :");

         iValue= sobj.nextInt();

         pattern pobj= new pattern();
         
         pobj.display(iValue);





    }
}