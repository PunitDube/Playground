#include <stdio.h> 
void printDivisors(int n) 
{ 
    for (int i=1;i<=n;i++) 
        if (n%i==0) 
            printf("%d\n",i); 
} 

int main() 
{ int pd;
  scanf("%d",&pd);
    printDivisors(pd); 
    return 0; 
} 