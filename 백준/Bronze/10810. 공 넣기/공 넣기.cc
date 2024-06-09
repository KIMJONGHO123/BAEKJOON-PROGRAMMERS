#include <stdio.h>

int main() {

	int n, m;
	int arr[101] = {0,};
	int i, j, k;

	scanf("%d %d", &n, &m);

	for (int l = 0; l < m; l++)
	{
		scanf("%d %d %d", &i,&j, &k);

		for (int p = i; p <= j; p++)
		{
			arr[p-1] = k;
		}
	}

	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	
	


	return 0;
}