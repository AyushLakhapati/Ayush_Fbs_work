//Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong

#include<stdio.h>
void main() {
	
    int no,i,temp,rem,sum=0;
    printf("Enter a number:");
    scanf("%d",&no);
    
	temp=no;
    
    while (temp>0){
   	rem=temp%10;
   	int fact=1;
   	for(i=1;i<=rem;i++){
   	fact=fact*i;	
	   }  
	   
	sum=sum+fact;
	temp=temp/10;
}

  if(sum==no){
  	printf("The given no is a strong number");
  }	   
   else{
   	printf("The given no is not a strong number");
   } 
    
}
