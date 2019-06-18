#include <stdio.h>
int main() {
	int n,s;
  scanf("%d",&n);
  if(n%10==6)
  {
  s=(n/1000)%10;
  printf("%d",s);
  }
  else
    printf("7");
	return 0;
}