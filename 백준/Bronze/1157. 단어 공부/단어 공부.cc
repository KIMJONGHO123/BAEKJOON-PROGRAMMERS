#include <stdio.h>
#include <string.h>
int main() {

	char arr[1000000],character;
	int frearr[26]={0}, max = 0;

	scanf("%s", arr);
	int len = strlen(arr);
	for (int i = 0; i < len; i++)
	{
		if (arr[i] >= 'A' && arr[i] <= 'Z') {
			frearr[arr[i] - 'A']++;
		}
		else {
			frearr[arr[i] - 'a']++;
		}
	}

	for (int i = 0; i < 26; i++)
	{
		if (frearr[i] > max) {
			max = frearr[i];
			character = i + 'A';
		}
		else if(frearr[i] == max) {
			character = '?';
		}

	}
	printf("%c", character);
	return 0;
}