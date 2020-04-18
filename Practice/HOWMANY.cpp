using namespace std;
#include <iostream>

int main()
{
	long int n; int digits=0;
	cin >> n;
	while (n)
	{
		n = n / 10;
		digits++;
	}
	if (digits == 1)
		cout << 1;
	else if (digits == 2)
		cout << 2;
	else if (digits == 3)
		cout << 3;
	else
		cout << "More than 3 digits";
	
}
