#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int i=0; i<=(2*n-1); i++) {
  if(i%2 == 1)
    printf("%d\n",i);
  }
	return 0;
}