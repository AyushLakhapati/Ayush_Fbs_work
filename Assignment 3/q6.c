//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect

#include<stdio.h>
void main() {
    int no,i,sum=0;
    printf("Enter a number:");
    scanf("%d",&no);
   for (i=1;i<=no/2;i++){
   	 if(no%i==0)
   	 {
   	 	sum=sum+i;
		}
		
   }
  if(sum==no){
  	printf("perfect number");
  }
  else{
  	printf("Not a perfect number");
  }
}
