using namespace std;
#include <iostream>
#include<math.h>

int main()
{
	int t; int n; int ans;
	cin >> t;
	while (t--)
	{
		cin >> n;
		ans = (int)pow(2, n);
		ans = (ans - 1) % 100000;
		cout << ans << endl;
	}
	return 0;
}
