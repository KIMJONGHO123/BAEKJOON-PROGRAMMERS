#include <stdio.h>


int main() {

	int n;
	scanf("%d", &n);


	for (int i = 1; i <= n; i++)
	{
		for (int j = 0; j < n-i; j++)
		{
			printf(" ");
		}
		for (int p = 0; p < (2*i)-1; p++)
		{
			printf("*");
		}
		printf("\n");
	}

	return 0;
}