#include <stdio.h>
int main() {
	int count; int sum = 0;
  scanf("%d", &count);
  for (int i =1; i <= count; i++)
  { sum = sum + i;
  }
  printf("%d", sum);
	return 0;
}