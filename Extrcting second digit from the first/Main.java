#include <stdio.h>
int main() {
int n;
  scanf("%d", &n);
  int copy = n; int d;
  int count = 0;
  while(copy>0)
  {
  copy = copy/10;
  count = count +1;
  }
  while(count> 1)
  {
   d = n%10;
  n = n/10;
    count = count - 1;
  }
  printf("%d", d);
}