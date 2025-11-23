#include <stdio.h>

void pattern(int irow ,int icol){

    for (int i=1;i<=irow;i++){
        for (int j=1;j<=i;j++){
            printf("*\t");

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