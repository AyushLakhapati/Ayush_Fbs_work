//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)

#include<stdio.h>
void main() {
   int no,sum=0,f,l;
   printf("Enter a number:");
   scanf("%d",&no);
   	l=no%10;
	while(no>=10){
		no=no/10;
	}    
	f=no;
	sum=f+l;
	
printf("The sum of first and last digit is:%d",sum);
}
