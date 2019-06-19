#include <stdio.h>
int main() {
int count ;
  scanf("%d", &count);
  int j = 0;
  for(int i = 1; i <30;i++)
  {
  if((i%2)==1)
  { printf("%d \n",i);
  j = j+1;}
    if(count ==j)
      break;
  }
	return 0;
}