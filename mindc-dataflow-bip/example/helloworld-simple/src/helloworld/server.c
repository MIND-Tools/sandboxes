#include <stdio.h>

void METH(filterctrl, act) (int c){
  int x=-1;
  printf("Server");
  x = CALL(s, get)();
  printf("[%d]\n", x);
}
