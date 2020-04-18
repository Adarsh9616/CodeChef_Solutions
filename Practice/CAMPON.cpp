#include <stdio.h>

int main(void)
{
	int T;
	scanf("%d",&T);
	for(int t=0;t<T;t++)
	{
		int Array[32] = {0};
		int N;
		scanf("%d",&N);
		for(int e=0;e<N;e++)
		{
			int l1,p1;
			scanf("%d %d",&l1,&p1);
			for(int w=l1;w<32;w++)
			{
				Array[w] += p1 ;
			}
		}
		int sum  =0;
		int Q;
		scanf("%d",&Q);
		for(int q=0;q<Q;q++)
		{
			int r,s;
			scanf("%d %d",&r,&s);
			if(Array[r]>=s)
				printf("Go Camp\n");
			else
				printf("Go Sleep\n");
		}
	}
}