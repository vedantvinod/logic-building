#include <stdio.h>

void pattern(int irow ,int icol){

    if (irow!=icol){
        printf("please enter the correct input");
        return ;
    }

    for (int i=1;i<=irow;i++){
        for (int j=1;j<=icol;j++){

            if (i==j){
                printf("*\t");
            }
            else if (i>j){
                printf("#\t");
            }
            else{
                  printf("@\t");
            }
            

        }
        printf("\n");
    }

}
int main (){

    int ivalue1=0,ivalue2=0;

    printf("enter the number of rows");
    scanf("%d",&ivalue1);

    printf("enter the number of column");
    scanf("%d",&ivalue2);

    pattern(ivalue1,ivalue2);

    

    return 0;
}