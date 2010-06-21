#ifndef BEAM_PARSE_SHIELD
#include <stdlib.h>
#endif

void METH(filterctrl, act) (int c){
  int r,i;
  for (i=0;i<c;i++){
    r = rand() % 256;
    CALL(output, put)(r);
  }
}
