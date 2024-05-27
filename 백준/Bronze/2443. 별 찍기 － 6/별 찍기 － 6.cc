#include <stdio.h>


int main() {

	int n;
	scanf("%d", &n);

	int discount = n;
	for (int i = 0; i < n; i++)
	{

		for (int p = 0; p < i; p++)
		{
			printf(" ");
		}

		for (int j = 0; j < (2*discount)-1; j++)
		{
			printf("*");
		}
		discount--;

		
		printf("\n");
	}

	return 0;
}