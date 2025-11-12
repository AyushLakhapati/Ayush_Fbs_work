//Check the given number is prime or not.
//Input: n = 7
//Output: Prime

#include<stdio.h>

void main() {
    int n, i, isPrime = 1;
    
    printf("Enter a number: ");
    scanf("%d", &n);

    if (n <= 1) {
        isPrime = 0; 
    } else {
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = 0;
                break;
            }
        }
    }
    if (isPrime)
        printf("Prime\n");
    else
        printf("Not Prime\n");

}
