# include <stdio.h>
 

void reverse(char *str)
{
   if (*str)
   {
       reverse(str+1);
       printf("%c", *str);
   }
}
 
/* Driver program to test above function */
int main()
{
   char a[] = "Geeks for Geeks";
   reverse(a);
   return 0;
}
