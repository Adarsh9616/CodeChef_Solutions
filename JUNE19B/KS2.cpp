#include <iostream>
using namespace std;
int main()
{
	unsigned long long int t;
	cin >> t;
	unsigned long long int n;unsigned long long int ans, add, temp;
		while (t--)
		{
			cin >> n;
			ans = n * 10;
			int sum = 0;
			int c = 0;
			while (n > 0)
			{
				sum = sum + n % 10;
				n = n / 10;
				c++;
			}
			add = sum;
			if(sum%10!=0)
			{
				temp = ((add / 10) + 1) * 10;
			}
			else
			{
				temp = add;
			}
			ans = ans + (temp - add);
			cout << ans<<endl;
		}
		return 0;
}
