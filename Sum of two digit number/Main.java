#include<stdio.h>
int main()
{int a,b,s;
scanf("%d",&a);
 b=(a/10)%10;
 s=(a%10);
 b=b+s;
 printf("%d",b);
  return 0;
}