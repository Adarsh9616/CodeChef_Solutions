using namespace std;
#include <iostream>

int main()
{
	int n; int s1=0, s2=0, max=0,p,q,win=0;
	cin >> n;
	while (n--)
	{
		cin >> p >> q;
		s1 = p + s1;
		s2 = q + s2;
		if ((s1 > s2) && (max < (s1 - s2)))
		{
			max = s1 - s2;
			win = 1;
		}
		else if ((s2 > s1) && (max < (s2 - s1)))
		{
			max = s2 - s1;
			win = 2;
		}
	}
	cout << win << " " << max << endl;
	return 0;
}
