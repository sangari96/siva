#include <bits/stdc++.h>
using namespace std;
 

bool isPower(unsigned n)
{
    if (n==1)  return true;
 
    
    for (int x=2; x<=sqrt(n); x++)
    {
        unsigned y = 2;
        unsigned p = pow(x, y);
 
       
        while (p<=n && p>0)
        {
            if (p==n)
                return true;
            y++;
            p = pow(x, y);
         }
    }
    return false;
}
 
// Driver Program
int main()
{
    for (int i =2; i<100; i++)
        if (isPower(i))
           cout << i << "  ";
    return 0;
}
