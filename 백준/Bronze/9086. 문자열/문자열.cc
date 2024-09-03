#include <stdio.h>

int main() {

	int t;
	char s[1000];
	scanf("%d", &t);
	

	for (int i = 0; i < t; i++) {
		int count = 0;
		scanf("%s", s);

		for (int j = 0; s[j] != '\0'; j++) {
			count++;
		}

		printf("%c%c", s[0],s[count-1]);

		printf("\n");
	}
}