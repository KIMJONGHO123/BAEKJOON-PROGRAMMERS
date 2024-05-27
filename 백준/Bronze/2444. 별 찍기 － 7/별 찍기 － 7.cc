#include <stdio.h>


int main() {

	int n,i;
	scanf("%d", &n);
	
	for (i = 1; i <= n; i++)
	{
		for (int j = 0; j < n-i; j++)
		{
			printf(" ");
		}
		for (int p = 0; p < (2 * i)-1; p++)
		{
			printf("*");
		}

		printf("\n");
		
	}
	for (int k = n-1; k > 0 ; k--)
	{
		for (int m = 0; m <n-k ; m++)
		{
			printf(" ");
		}
		for (int l = 0; l < (2 * k) - 1; l++)
		{
			printf("*");
		}
		printf("\n");
	}

	return 0;
}