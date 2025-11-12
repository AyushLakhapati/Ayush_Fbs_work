//Print a solid square pattern
//Input: n = 4
//Output:
//* * * *
//* * * *
//* * * *
//* * * *
#include<stdio.h>
void main(){
	int n,i,j;
	printf("Enter the value of n:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		for (j=0;j<n;j++){
			printf("* ");
		}
		printf("\n");
	}
}
