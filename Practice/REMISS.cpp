#include <stdio.h>
int main()
{
    int t, i,a,b,min,max;
    scanf("%d",&t);
    if(t>=1 && t<=100)
    {
        for(i=0;i<t;i++)
        {
            scanf("%d %d",&a,&b);
            if(a>=0 && a<=1000000 && b>=0 && b<=1000000)
            if(a>b)
            {
                min=a;
            }
            else
            {
                min=b;
            }
            max= a+b;
            printf("%d %d\n",min,max);
            
        }
    }
    return 0;
}