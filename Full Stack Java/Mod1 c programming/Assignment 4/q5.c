//Write a menu driven program to take a number for user and perform operations as follows.
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.

#include <stdio.h>

void main() {
    int choice,num,i,rev,rem,temp,sum;
    printf("Enter a number: ");
    scanf("%d", &num);

    printf("Menu:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Find Sum of Digits\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1) {  
        if (num % 2 == 0)
            printf("%d is Even.\n", num);
        else
            printf("%d is Odd.\n", num);
    }
    else if (choice == 2) {  
        if (num <= 1) {
            printf("%d is not Prime.\n", num);
        } else {
            int isPrime = 1;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime)
                printf("%d is Prime.\n", num);
            else
                printf("%d is Not Prime.\n", num);
        }
    }
    else if (choice == 3) {  
        temp = num;
        rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if (rev == num)
            printf("%d is Palindrome.\n", num);
        else
            printf("%d is Not Palindrome.\n", num);
    }
    else if (choice == 4) {  
        if (num > 0)
            printf("%d is Positive.\n", num);
        else if (num < 0)
            printf("%d is Negative.\n", num);
        else
            printf("Number is Zero.\n");
    }
    else if (choice == 5) {  
        temp = num;
        rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        printf("Reverse of %d is %d.\n", num, rev);
    }
    else if (choice == 6) { 
        temp = num;
        sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum+rem;
            temp = temp/10;
        }
        printf("Sum of digits of %d is %d.\n", num, sum);
    }
    else {
        printf("Invalid Choice!\n");
    }
}

