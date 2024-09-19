#include <stdio.h>

int main() {
	int q, d, n, p,t,c;

	scanf("%d", &t);
	for (int i = 0; i < t; i++)
	{
		scanf("%d", &c);
		
		q = c / 25;
		d = c % 25 / 10;
		n = c % 25 % 10 / 5;
		p = c % 25 % 10 % 5 / 1;

		
		printf("%d %d %d %d\n", q, d, n, p);
	}



	return 0;
}