//Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome

#include<stdio.h>
void main() {
	
    int no,temp,rem,sum=0;
    printf("Enter a number:");
    scanf("%d",&no);
    
    temp=no;

 for( ; no>0; no=no/10){
 	rem=no%10;
 	sum=sum*10+rem;
 	
 }

  if(temp==sum){
  	printf("The given no is a pallindrome number");
  }	   
   else{
   	printf("The given no is not a pallindrome number");
   } 
    
}
