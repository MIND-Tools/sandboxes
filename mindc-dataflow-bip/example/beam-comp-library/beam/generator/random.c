#include <stdlib.h>

void METH(filterctrl, act) (int c){
  int r = rand() % 256;
  CALL(output, put)(r);
}
