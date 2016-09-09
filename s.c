#include<stdio.h>
#include<math.h>
main()
{
 float h, a, b, n, x[20], y[20], sum = 0, integral;
 int i;
 clrscr();
 printf("enter the value of a, b, n:");
 scanf("%f %f %f", &a, &b, &n);
 printf("enter the values of x:");
 for(i = 0; i <= (n-1); i++)
 {
  scanf("%f", &x[i]);
 }
 printf("\n enter the values of y:");
 for(i = 0; i <= (n-1); i++)
 {
  scanf("%f", &y[i]);
 }
 h = (b-a)/n;
 x[0] = a;
 for(i = 1; i <= n-1; i++)
 {
  x[i] = x[i-1] + h;
  sum = sum + 2 * y[i];
 }
 sum = sum + y[b];
 integral = sum * (h/2);
 printf("approximate integral value is: %f", integral);
 getch();
}
