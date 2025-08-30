//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

#include<stdio.h>
void main(){
	int start,i,end,sum=0;
	
	printf("Enter the start value:");
	scanf("%d",&start);
	printf("\n Enter the end value:");
	scanf("%d",&end);
	
	for( i = start; i <= end; i++) {
        sum=sum+i;
    }

    printf("%d\n", sum);
}
