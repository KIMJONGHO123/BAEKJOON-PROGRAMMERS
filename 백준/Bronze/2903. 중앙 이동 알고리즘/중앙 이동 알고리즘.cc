#include <stdio.h>
#include<math.h>
int main() {
	int n,firstcount=2,jumcount;

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		jumcount = firstcount + (firstcount - 1);
		firstcount = jumcount;
	}

	int value = pow(jumcount, 2);
	printf("%d",value );
	return 0;
}