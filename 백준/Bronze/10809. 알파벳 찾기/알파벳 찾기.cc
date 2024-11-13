#include <stdio.h>
#include <string.h>

int main() {

	char s[101];
	int arr[26];
	scanf("%s", s);

	for (int i = 0; i < 26; i++)
	{
		arr[i] = -1;
	}
	int length = strlen(s);
	for (int i = 0; i < length; i++)
	{
		int index = s[i] - 'a';
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
