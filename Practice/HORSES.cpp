#include<stdio.h>
int main()
{
    int t,n,min,i,j,temp;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d",&n);
        int a[n];
        for(i=0;i<n;i++)
        {
            scanf("%d",&a[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        min=a[1]-a[0];
        i=1;
        while(i<n)
        {
            if(a[i]-a[i-1]<min)
            {
                min=a[i]-a[i-1];
            }
            i++;
        }
        printf("\n");
        printf("%d",min);
    }
    return 0;
}