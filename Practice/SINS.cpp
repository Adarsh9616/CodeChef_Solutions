using namespace std;
#include <iostream>

int main()
{
	int t; int x, y, r, choco = 0;
	cin >> t;
	while (t--)
	{
		cin >> x >> y;
		r = x % y;
		while (r!=0)
		{
			x = y;
			y = r;
			r = x % y;
		}
		choco = y;
		cout << 2 * choco << endl;
	}
	return 0;
}