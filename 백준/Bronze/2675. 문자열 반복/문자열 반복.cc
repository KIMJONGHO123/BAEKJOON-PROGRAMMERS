#include <stdio.h>
#include <string.h>
int main() {

	int t,r;
	char s[20];

	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
		scanf("%d%s", &r,s);

		for (int i = 0; i < strlen(s); i++) {
			for (int j = 0; j < r; j++) {
				printf("%c", s[i]);
			}
		}
		printf("\n");
	}
	
}