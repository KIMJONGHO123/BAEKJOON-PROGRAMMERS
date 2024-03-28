#include <stdio.h>

int main() {

	int totalPrice, typeNumber, price, number;
	int sum = 0;
	scanf("%d %d", &totalPrice, &typeNumber);

	for (int i = 0; i < typeNumber; i++)
	{
		scanf("%d %d", &price, &number);
		sum += price * number;
	}
	if (sum == totalPrice)
	{
		printf("Yes");
	}
	else
	{
		printf("No");
	}
	return 0;
}