#include <stdio.h>

int main() {
    char a[101];

    while(scanf("%[^\n]", a) != EOF) {
        printf("%s\n", a);
        getchar();
    }

    return 0;
}
