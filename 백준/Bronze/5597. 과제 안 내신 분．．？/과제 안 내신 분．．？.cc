#include <stdio.h>

int main() {

	int arr[31] = {0,};
	int line=28;
	int index;


	for (int p = 0; p < line; p++)
	{
		scanf("%d", &index);
		arr[index] = 1;
	}
	for (int i = 1; i <= 30; i++)
	{
		if (arr[i] ==0)
		{
			printf("%d\n", i);

		}
	}
	


	return 0;
}