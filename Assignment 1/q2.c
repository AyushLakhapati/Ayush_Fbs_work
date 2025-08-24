#include<stdio.h>
void main(){
int no=567,f,l;
f=no/100;
l=no%10;
  if (f==l){
  	printf("%d is pallindrome",no);
  }
  else{
  	printf("%d is not pallindrome",no);
  }
}
