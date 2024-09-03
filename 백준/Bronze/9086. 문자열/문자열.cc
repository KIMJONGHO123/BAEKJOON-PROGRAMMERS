#include <stdio.h>
#include <string.h>
int main() {

	int t;
	char s[1000];
	scanf("%d", &t);
	

	for (int i = 0; i < t; i++) {
		int count = 0;
		scanf("%s", s);

		printf("%c%c", s[0],s[strlen(s)-1]);

		printf("\n");
	}
}