//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.
#include<stdio.h>
void main(){
	int num1,num2;
	char op;
	printf("Enter the first number:\n");
	scanf("%d",&num1);
	printf("Enter the second number:\n");
	scanf("%d",&num2);
	printf("Enter operator (+,-,/,*,%%):");
	fflush(stdin);
	scanf("%c",&op);

if (op == '+') {
        printf("Result: %d\n", num1 + num2);
    } 
	
	else if (op == '-') {
        printf("Result: %d\n", num1 - num2);
    } 
	else if (op == '*') {
        printf("Result: %d\n", num1 * num2);
	}
     
	 else if (op == '/') {
        if (num2 != 0)
            printf("Result: %d\n", num1 / num2);
		else
            printf("Error: Division by zero!\n");
    } 
	
	else if (op == '%') {
        if (num2 != 0)
            printf("Result: %d\n", num1 % num2);
        else
            printf("Error: Modulo by zero!\n");
    } 
	
	else {
        printf("Invalid operator!\n");
    }

}
