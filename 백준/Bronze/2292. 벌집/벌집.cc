#include <stdio.h>

int main() {
	long long n, start=1,bangcount = 1, expression=1;
	scanf("%lld", &n);
	long long num = 1;

	if (n == 1) {

		printf("%d", bangcount);
		return 0;
	}
	while (1) {
		
		expression += 6 * num++;
		bangcount++;
		
		if (n <= expression)
		{
			
			break;
		}
		
	}
	printf("%lld", bangcount);
	
	return 0;
}