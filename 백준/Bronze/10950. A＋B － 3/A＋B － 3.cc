#include <stdio.h>


int main() {

	int number;
	int n1, n2;
	scanf("%d", &number);

	for (int i = 0; i < number; i++)
	{
		scanf("%d %d", &n1, &n2);
		printf("%d\n", n1 + n2);
	}

	




	return 0;
}