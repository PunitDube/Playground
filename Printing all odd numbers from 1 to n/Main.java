#include <stdio.h>

int main()
{
    int i, n;
    scanf("%d", &n);

    for(i=1; i<=n; i++)
    {
        /* If 'i' is odd then print it */
        if(i%2!=0)
        {
            printf("%d\n", i);
        }
    }

    return 0;
}