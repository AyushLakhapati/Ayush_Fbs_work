// Print a hollow square with diagonal pattern
//Input: n = 5
//Output:
//
//* * * * *
//* *     *
//*   *   *
//*     * *
//* * * * *
#include <stdio.h>

void main() {
    int n, i, j;
    printf("enter the value of n: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            if (i == 1||i == n||j == 1||j == n|| i == j) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }
}


