//Print an inverted pyramid pattern
//Input: n = 5
//Output:

//*****
//****
//***
//**
//*
#include <stdio.h>
void main() {
    int n, i, j;
    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = n; i >= 1; i--) {
        for (j = 1; j <= 2 * n - 1; j++) {
            if (j >= n - i + 1 && j <= n + i - 1) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}
