# include <stdio.h>

int main() {

	int n, v;
	int number[100];
	int count = 0;

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		scanf("%d", &number[i]);
	}

	scanf("%d", &v);

	for (int i = 0; i < n; i++)
	{
		
		if (number[i] == v )
		{
			count += 1;
		}
	}

	if (count != 0)
	{
		printf("%d", count);
	}
	else
	{
		printf("%d",count);
	}

	return 0;
}