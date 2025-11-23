// 4
// # 1 * # 2 * # 3 *  #  4 *
// 1 2 3 4 5 6 7 8 9 10 11 12

import java.util.*;


class  pattern{
    public void display(int ino){

        for (int icnt=1;icnt <=ino;icnt++){
            System.out.print("#"+"\t"+icnt+"\t"+"*"+"\t");
        }
    }



}

public class assignment26_4{

    public static void main(String a[]){

        int iValue=0;
         Scanner sobj= new Scanner(System.in);

         System.out.print("enter the number :");

         iValue= sobj.nextInt();

         pattern pobj= new pattern();
         
         pobj.display(iValue);





    }
}