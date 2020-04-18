using namespace std;
#include <iostream>

int main()
{
	int t; long int n,r;
	cin >> t;
	while (t--)
	{
		cin >> n; r = 0;
		while (n)
		{
			r = (n % 10) + r*10;
			n = n / 10;
		}
		cout << r << endl;

	}
	return 0;

}
