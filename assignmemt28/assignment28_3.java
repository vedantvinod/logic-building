import java.util.*;
class  pattern{
    public void display(int irow,int icol){
      int i=0;
      
      int j=0;

    
       for (i=0;i<irow;i++){
            for (j=0;j<icol;j++){
                
                System.out.print((char)('A'+i%26)+"\t");
            }
             System.out.println("");
         }
            
        }

    }

public class assignment28_3{

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