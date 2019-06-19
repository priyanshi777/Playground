#include <stdio.h>
int main() {
	int n; int d;
  scanf("%d",&n);
  int copy = n; int count = 0;int copycheck =n;
  while(copy>0)
  {
  copy = copy/10;
  count = count +1;
  }
  int sum = 0;
  for(int i =1; i<=count; i++)
  {
    d = n%10;
    sum = sum+ pow(d,count);
    n = n/10;
  }
  if (copycheck == sum)
  {
  printf("Armstrong Number");
  }
  else
  {
  printf("Not an Armstrong Number");
  }
	return 0;
}