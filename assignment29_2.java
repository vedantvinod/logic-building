import java.util.*;
class  pattern{
    public void display(int irow,int icol){
      int i=0;
      
      int j=0;
        int icnt=2;
    
       for (i=0;i<irow;i++){
            for (j=0,icnt=2;j<icol;j++){
            if(i%2!=0)
            {      
             System.out.print((icnt)+"\t");
             icnt=icnt+2;
            }
            else{
                System.out.print((icnt+1)+"\t");
            }
            }
              System.out.println("");
        

         }
        
         
        

    }
}

public class assignment29_2{

    public static void main(String a[]){

        int iValue1=0;
        int ivalue2=0;
         Scanner sobj= new Scanner(System.in);

         System.out.print("enter the number of rows and column u want to display:");

         iValue1= sobj.nextInt();
         ivalue2= sobj.nextInt();

         pattern pobj= new pattern();
         
         pobj.display(iValue1,ivalue2);

    }
}