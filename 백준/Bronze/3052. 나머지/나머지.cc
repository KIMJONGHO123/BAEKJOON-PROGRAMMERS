#include <stdio.h>

int main() {

	int n;
	int arr[1000];
	int value,count = 0, result = 0;
	
	for (int i = 0; i < 10; i++)
	{
		scanf("%d", &n);

		arr[i] = n % 42;
	
	}
	
	for (int j = 0; j < 10; j++)
	{
		count = 0;
		for (int k = j+1; k < 10; k++)
		{
			if (arr[j] == arr[k])
			{
				count++;
			}
			
		}
		if (count ==0)
		{
			result++;
		}
		
	}
	printf("%d", result+count);

	


	return 0;
}