#include <stdio.h>
#include <math.h>

typedef struct{
  int x;
  int y;
}Point;

double distance(const Point *p1, Point *p2){
  return sqrt(pow((p1->x - p2->x),2) + pow((p1->y - p2->y),2));
}

int is_square(Point *a, Point *b, Point *c, Point *d){
  double ab, bc, cd, ad;
  ab = distance(a,b);
  bc = distance(b,c);
  cd = distance(c,d);
  ad = distance(a,d);
  if((ab == bc) && (ab == cd) && (ab == ad))
    return 1;
  else
    return 0;
}
int main(){

  Point a = {0,0};
  Point b = {0,1};
  Point c = {1,1};
  Point d = {1,0};

  printf("They %s form a square.",(is_square(&a,&b,&c,&d))?"do":"don't");
  
  return 0;
}
