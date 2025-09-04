//Print an inverted right-angled triangle pattern
//Input: n = 5
//Output:

//*****
//****
//***
//**
//*
#include<stdio.h>
void main(){
	int n,i,j;
	printf("enter the value for n:");
	scanf("%d",&n);
	 for(i=n;i>=1;i--){
		for(j=1;j<=i;j++){
			printf("* ");
			
		}
		printf("\n");
	}
}
