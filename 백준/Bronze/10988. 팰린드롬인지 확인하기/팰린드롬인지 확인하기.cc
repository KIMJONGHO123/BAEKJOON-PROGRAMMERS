#include<stdio.h>
#include<string.h>
int main() {

	char scanf_array[100];
	char array[100];
	int number = 1;

	scanf("%s", scanf_array);

	int index = strlen(scanf_array) - 1;

	for (int i = 0; i < strlen(scanf_array); i++) {
		
		array[index] = scanf_array[i];
		index--;
	}


	for (int i = 0; i < strlen(scanf_array); i++)
	{
		if (scanf_array[i] != array[i]) {
			number = 0;
			break;
		}
		
	}

	printf("%d", number);
	return 0;
}