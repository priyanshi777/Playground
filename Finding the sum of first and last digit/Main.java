#include <stdio.h>
int main() {
	int n;
    scanf("%d", &n);
  int copy = n; int d; int fd;
  int count = 0;
  while(copy>0)
  {
  copy = copy/10;
  count = count +1;
  }
  int sum = 0;
  int ld = n%10;
  while(count>0)
  {
   fd = n%10;
  n = n/10;
  count = count -1;
  }
  sum = fd+ld;
  printf("%d", sum);
	return 0;
}