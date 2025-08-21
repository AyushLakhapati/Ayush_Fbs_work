#include<stdio.h>
void main(){
  int min,hrs,remmin;
  min=140;
  hrs=min/60;
  remmin=min%60;
  printf("The remaining time is %d hours and %d minutes",hrs,remmin);	
}
