#include <stdio.h>
#include <string.h>
int main() {

	int count = 0;
	char s[1000000];

	scanf("%[^\n]", s);

	if (strlen(s) == 1) {
		if (s[0] == ' ') {
			printf("0\n");
			return 0;
		}
	}

	for (int i = 1; i < strlen(s)-1; i++) {
		if (s[i] == ' ') {
			count++;
		}
	}

	
	printf("%d", count+1);
}