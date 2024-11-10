#include <stdio.h>
#include <string.h>

int main() {

	char s[101];
	int arr[26] = {-1};
	scanf("%s", s);
	int length = strlen(s);
	
	for (int i = 0; i < 26; i++)
	{
		arr[i] = -1;
	}
	for (int i = 0; i < length; i++)
	{
		int index = s[i] - 97;
		if (arr[index] == -1) {
			arr[index] = i;
		}
		
	}

	for (int i = 0; i < 26; i++)
	{
		printf("%d ", arr[i]);
	}
	


	return 0;
}
