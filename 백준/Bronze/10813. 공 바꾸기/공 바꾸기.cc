#include <stdio.h>

int main() {

	int n, m;
	int i, j;
	int arr[101];
	int tmp;

	scanf("%d %d", &n, &m);

	for (int l = 0; l < n; l++)
	{
		arr[l] = l + 1;
	}

	for (int p = 0; p < m; p++)
	{
		

		scanf("%d %d", &i, &j);
		
		
		tmp = arr[i-1];
		arr[i-1] = arr[j-1];
		arr[j-1] = tmp;
		
	}
	
	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}

	return 0;
}