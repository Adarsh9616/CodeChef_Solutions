using namespace std;
#include <iostream>

 int main()
{
	 int t, i,j;
	cin >> t;
	int ar[100]; int digits[200]; int m; int n; int temp,c;
	for (i = 0; i < t; i++)
	{
		cin >> ar[i];
	}
	for(i=0;i<t;i++)
	{
		cout << "\n";
		temp = 0;
		digits[0] = 1;
		m=1;
		n = 1;
		while ( n <= ar[i])
		{
			for (j = 0; j < m; j++)
			{
				c = digits[j] * n + temp;
				digits[j] = c % 10;
				temp = c / 10;
			}
			while (temp)
			{
				digits[m++] = temp % 10;
				temp = temp / 10;
			}
			n++;
		}
		for (j=m-1; j>=0; j--)
		{
			cout << digits[j];
		}
		
	}
	return 0;
}
