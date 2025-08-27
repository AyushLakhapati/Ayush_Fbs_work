//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.

#include<stdio.h>
void main(){
float price,discount,totalprice=0;
char student;
printf("enter purchase:");
scanf("%f",&price);
if(price){
	printf("ARE YOU A STUDENT:");
	scanf(" %c",&student);
	if(student=='y'||student=='Y'){
		if(price>500){
			discount=0.2*price;
			totalprice=price-discount;
			printf("Total discount:%f",totalprice);
			
		
		}
		else{
			
			discount=0.1*price;
			totalprice=price-discount;
			printf("Total discount:%f",totalprice);
		}
	
	}
	else {
	   if(price>600){
	   
		
			discount=0.15*price;
			totalprice=price-discount;
			printf("Total discount:%f",totalprice);
}
else{
	discount=0.00*price;
    totalprice=price-discount;
    printf("Total discount:%f",totalprice);
}
	}
}
}
