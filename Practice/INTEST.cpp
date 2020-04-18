using namespace std;
#include <iostream>

int main()
{
	int n, k;
	cin >> n >> k;
	int t; int ans = 0;
	while (n--)
	{
		cin >> t;
		if (t%k == 0)
		{
			ans++;

		}
	}
	cout << ans << endl;
	

}
