#include <stdio.h>
int main() {
	//Type your code
  int n,i=0,a[50],count=0;
  scanf("%d", &n);
  while(n!=0) {
  a[i] = n%10;
    count++;
    n = n/10;
    i++;
  }
  printf("%d", a[count-2]);
	return 0;
}