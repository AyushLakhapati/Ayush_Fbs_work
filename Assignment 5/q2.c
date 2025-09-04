//Print a right-angled triangle pattern
//Input: n = 5
//Output:
//*
//**
//***
//****
//*****

#include<stdio.h>
void main(){
	int n,i,j;
	 printf("enter the value of n:");
	 scanf("%d",&n);	 
	 for(i=0;i<=n;i++){
	 	for(j=0;j<=i;j++){
	 		printf("* ");
		 }
		 printf("\n");
	 }
}



