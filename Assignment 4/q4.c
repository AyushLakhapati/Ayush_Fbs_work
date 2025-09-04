//Print strong numbers in the given range 1 to#include <stdio.h>
#include<stdio.h>

void main() {
    int n, i, temp, rem, sum, fact, j;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    printf("Strong numbers between 1 and %d are:\n", n);

    for (i = 1; i <= n; i++) {
        temp = i;
        sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            
            fact = 1;
            for (j = 1; j <= rem; j++) {
                fact *= j;
            }

            sum = sum+fact;
            temp = temp/10;
        }
        if (sum == i) {
            printf("%d ", i);
        }
    }
}

