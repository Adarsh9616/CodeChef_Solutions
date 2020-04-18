using namespace std;
#include<iostream>
int main()
{
	int n=0,i=0; int ar[50];
	while (1)
	{
		cin >> ar[n];
		
		if (ar[n] == 42)
			break;
		n++;
	}
	while (i < n)
	{
		cout << ar[i]<<"\n";
		i++;
	}
		
	return 0;
}
