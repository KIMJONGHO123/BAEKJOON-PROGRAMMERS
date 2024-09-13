#include <stdio.h>

int main() {

	char subject[51],grade[3];  // 문자열 끝을 표시하는 널 문자까지 포함하려면 공간이 하나 더 필요함.
	double credit,creditsum=0.0,gradescore,multiply=0.0,avg;

	for (int i = 0; i < 20; i++)
	{
		scanf("%s %lf %s", subject, &credit, grade);

		if (grade[0] == 'P')
		{
			continue;
		}
		creditsum += credit;
		if (grade[0] == 'F') {
			continue;
		}
		else if (grade[0] == 'A') {
			gradescore = 4;
		}
		else if (grade[0] == 'B') {
			gradescore = 3;
		}
		else if (grade[0] == 'C') {
			gradescore = 2;
		}
		else if (grade[0] == 'D') {
			gradescore = 1;
		}
		if (grade[1]=='+')
		{
			gradescore += 0.5;
		}
		multiply += credit * gradescore;
	}

	avg = multiply / creditsum;
	printf("%lf", avg);

	return 0;
}