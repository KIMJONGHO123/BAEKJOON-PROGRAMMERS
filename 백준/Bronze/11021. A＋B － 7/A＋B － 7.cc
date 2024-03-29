#include <stdio.h>

int main() {

	int t,A,B;
	scanf("%d", &t);

	for (int i = 1; i <= t; i++)
	{
		scanf("%d %d", &A, &B);
		printf("Case #%d: %d\n", i, A + B);
	}
	return 0;
}