#include <stdio.h>
void main() {
    float basic = 4500; 
    float da, ta, hra, total;

    if (basic <= 5000) {
        da = basic * 0.10;  
        ta = basic * 0.20;  
        hra = basic * 0.25; 
    } else {
        da = basic * 0.15; 
        ta = basic * 0.25;  
        hra = basic * 0.30; 
    }
    total = basic + da + ta + hra;
    printf("DA: %.2f\n", da);
    printf("TA: %.2f\n", ta);
    printf("HRA: %.2f\n", hra);
    printf("Total Salary: %.2f\n", total);

}
