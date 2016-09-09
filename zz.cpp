#include<stdio.h>
#define bool int
 

bool isPowerOfTwo(int n)
{
  if (n == 0)
    return 0;
  while (n != 1)
  {
    if (n%2 != 0)
      return 0;
    n = n/2;
  }
  return 1;
}
 

int main()
{
  isPowerOfTwo(31)? printf("Yes\n"): printf("No\n");
  isPowerOfTwo(17)? printf("Yes\n"): printf("No\n");
  isPowerOfTwo(16)? printf("Yes\n"): printf("No\n");
  isPowerOfTwo(2)? printf("Yes\n"): printf("No\n");
  isPowerOfTwo(18)? printf("Yes\n"): printf("No\n");
  isPowerOfTwo(1)? printf("Yes\n"): printf("No\n");
  return 0;
}
