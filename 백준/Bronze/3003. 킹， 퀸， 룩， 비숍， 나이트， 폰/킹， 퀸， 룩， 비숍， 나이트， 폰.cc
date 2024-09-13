#include<stdio.h>

int main() {

	int king=1, queen=1, look=2, bishop=2, night=2, phone=8;
	int n1, n2, n3, n4, n5, n6;
	scanf("%d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6);

	printf("%d ", king - n1);
	printf("%d ", queen - n2);
	printf("%d ", look - n3);
	printf("%d ", bishop - n4);
	printf("%d ", night - n5);
	printf("%d", phone - n6);

	

	return 0;
}