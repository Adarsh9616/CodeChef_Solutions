using namespace std;
#include <iostream>

int main()
{
	int t; int n, m;
	cin >> t;
	while (t--)
	{
		cin >> n;
		cin >> m;
		if (n % 2 == 0 || m % 2 == 0)
		{
			cout << "YES" << endl;
		}
		else
		{
			cout << "NO" << endl;
		}
	}
	return 0;
}
