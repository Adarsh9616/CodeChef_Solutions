using namespace std;
#include <iostream>

int main()
{
	int t;  int no;
	cin >> t;
	while (t--)
	{
		int sum = 0;
		cin >> no;
		while (no)
		{
			sum = sum + (no % 10);
			no = no/ 10;
     	}
		
		cout << sum<<endl;
	}
	return 0;
}
