#include <stdio.h>

void METH(filterctrl, act) (int c){
  int x = 19;
  printf ("Client");
  CALL(s,put)(x);
  printf("[%d]\n", x);
}
