//Print a half pyramid using numbers
//Input: n = 5
//Output:
//1
//12
//123
//1234
//12345

#include <stdio.h>
void main() {
    int n, i, j;
    printf("enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++) {
            printf("%d", j);
        }
        printf("\n");
    }
}

