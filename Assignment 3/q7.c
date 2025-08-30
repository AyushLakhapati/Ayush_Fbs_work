//Find factorial of given number.
//Input: n = 5
//Output: 120

#include<stdio.h>

void main() {
    int no,i,fact=1;
    printf("Enter a number:");
    scanf("%d",&no);
   for (i=1;i<=no;i++){
  fact=fact*i;
}
  printf("the factor is:%d",fact);
}
