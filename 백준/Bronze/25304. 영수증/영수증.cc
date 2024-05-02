#include <stdio.h>


int main() {

	int total;
	int kind;
	int price;
	int number;
	int sum = 0;

	scanf("%d", &total);
	scanf("%d", &kind);
	
	for (int i = 0; i < kind; i++)
	{
		scanf("%d %d", &price, &number);
		sum += price * number;
	}

	if (sum == total)
	{
		printf("Yes");
	}
	else
	{
		printf("No");
	}

	return 0;
}