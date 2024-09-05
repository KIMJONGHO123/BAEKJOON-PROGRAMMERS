#include <stdio.h>
#include <string.h>
int main() {

	char alpabet[26];
	char s[100] = "";
	scanf("%s", s);

	for (int i = 0; i < sizeof(alpabet); i++) {
		alpabet[i] = -1;
	}

	for (int i = 0; i < strlen(s); i++) {
		int index = s[i] - 'a';
		if (alpabet[index] == -1) {
			alpabet[index] = i;
		}
		else {
			continue;
		}
	}
	
	for (int i = 0; i < sizeof(alpabet); i++) {
		printf("%d ", alpabet[i]);
	}
}