//Print a pattern of stars in diamond shape
//Input: n = 4
//Output:
//
//*
//**
//***
//****
//***
//**
//*
#include <stdio.h>
void main() {
    int n, i, j;
    printf("enter the value of n: ");
    scanf("%d", &n);

    // Upper half
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
    // Lower half 
    for (i = n - 1; i >= 1; i--) {
        for (j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
}

