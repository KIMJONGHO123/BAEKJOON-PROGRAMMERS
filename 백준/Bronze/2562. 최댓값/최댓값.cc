#include <stdio.h>

int main() {

	int n[9];
	int max=0;
	int indexNumber=0;


	for (int i = 0; i < 9; i++)
	{
		scanf("%d", &n[i]);
		if (max < n[i])
		{
			max = n[i];
		}
	}

	for (int p = 0; p < 9; p++)
	{
		if (max == n[p])
		{
			indexNumber = p;
		}
	}

	printf("%d\n", max);
	printf("%d", indexNumber+1);
	return 0;
}