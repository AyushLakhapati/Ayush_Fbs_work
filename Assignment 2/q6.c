//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)
//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.

#include<stdio.h>
void main(){
int num;
printf("enter a no:");
scanf("%d",&num);
if(num%3==0 && num%5==0){
	printf("%d is divisible by both 3&5",num);
}
	else if(num%3==0 && num%5!=0){
		printf("%d is divisible by 3 but not by 5",num);
	}
	else if(num%3!=0 && num%5==0){
		printf("%d is divisible by 5 but not by 3",num);
	}
	else{
		printf("%d is divisible by none",num);
	}

}
