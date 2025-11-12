#include<stdio.h>
void main(){
int year;
printf("enter a year:");
scanf("%d",&year);
if(year%4==0&&year%100!=0||year%400==0){
	printf("the year entered is a leap year");
}
else{
	printf("the year enterd is not a leap year");
}
	
}
