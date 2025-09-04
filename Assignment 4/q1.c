//Print armstrong numbers in the given range 1 to n.

#include <stdio.h>

void main() {
    int n, num, temp, rem, sum; 
    printf("Enter the value of n: ");
    scanf("%d", &n);

    printf("Armstrong numbers between 1 and %d are:\n", n);

    for (num = 1; num <= n; num++) {
        temp = num;
        sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        if (sum == num) {
            printf("%d ", num);
        }
    }

}

