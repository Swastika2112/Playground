#include<stdio.h>
int main()
{
  //Type your code here
  int a,b;
  scanf("%d",&a);
  b = (a/100) + (a%10);
  printf("%d", b);
  return 0;
}