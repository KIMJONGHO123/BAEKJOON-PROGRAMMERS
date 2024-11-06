#include <stdio.h>
#include <string.h>
int main() {

	char arr[1000005],character;
	int alpabet[26] = {0,};
	int max = 0;
	scanf("%s", arr);
	int length = strlen(arr);
	for (int i = 0; i < length;i++)
	{
		if (arr[i] >= 'a' && arr[i]<='z') {
			alpabet[arr[i] - 'a']++;
		}
		else if (arr[i] >= 'A' && arr[i] <= 'Z') {
			alpabet[arr[i] - 'A']++;
		}
	}

	for (int i = 0; i < 26; i++)
	{
		if(alpabet[i]>max){
			max = alpabet[i];
			character = 'A' + i;

		}
		else if (alpabet[i] == max) {
			character = '?';
		}
	}
	printf("%c", character);
	
	return 0;
}
