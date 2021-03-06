#include<bits/stdc++.h>
using namespace std;
 

struct Interval
{
    int start, end;
};
 

bool compareInterval(Interval i1, Interval i2)
{
    return (i1.start < i2.start);
}
 

void mergeIntervals(Interval arr[], int n)
{
    
    if (n <= 0)
        return;
 
    
    stack<Interval> s;
 
   
    sort(arr, arr+n, compareInterval);
 
    
    s.push(arr[0]);
 
   
    for (int i = 1 ; i < n; i++)
    {
       
        Interval top = s.top();
 
        
        if (top.end < arr[i].start)
            s.push(arr[i]);
 
        
        else if (top.end < arr[i].end)
        {
            top.end = arr[i].end;
            s.pop();
            s.push(top);
        }
    }
 
   
    cout << "\n The Merged Intervals are: ";
    while (!s.empty())
    {
        Interval t = s.top();
        cout << "[" << t.start << "," << t.end << "] ";
        s.pop();
    }
    return;
}
 
