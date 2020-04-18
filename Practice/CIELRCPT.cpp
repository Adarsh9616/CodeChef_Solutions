using namespace std;
#include <iostream>
#include<math.h>

int main()
{
	int t; int ans; int p; int i; int n;
	cin >> t;
	while (t--)
	{
		ans = 0;
		cin >> p;
		for (i = 11; i >= 0; i--)
		{
			n = (int)pow(2, i);
			if (p - n >= 0)
			{
				p = p - n;
				i++;
				ans++;
			}
		}
		cout << ans << endl;
	}
	return 0;
}
