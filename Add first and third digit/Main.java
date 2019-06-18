#include<stdio.h>
int main()
{int s;
  scanf("%d",&s);
 int s1=(s/100);
 s1=s1%10;
 int s2=(s%10);
 int sum=s1+s2;
 printf("%d",sum);
  return 0;
}