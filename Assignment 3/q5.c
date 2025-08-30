//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>

void main() {
    int num,rem,temp,sum=0;
    
    printf("Enter a number: ");
    scanf("%d", &num);
    temp=num;

    while(num>0){
    	rem=num%10;
    	sum=sum+(rem*rem*rem);
    	num=num/10;
    	
	}
	if(temp==sum){
		printf("The given no is an armstrong number");
	}
	else{
		printf("The given no is not an armstrong number");
	}
}
