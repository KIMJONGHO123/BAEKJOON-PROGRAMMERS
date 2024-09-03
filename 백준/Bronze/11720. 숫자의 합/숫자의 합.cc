#include <stdio.h>
#include <string.h>
int main() {

	int n1, sum = 0;
	char n2[100] = "";

	scanf("%d", &n1);
	scanf("%s", n2);

	for (int i = 0; i < n1; i++) {
		sum += n2[i] - 48;
	}

	printf("%d", sum);



}