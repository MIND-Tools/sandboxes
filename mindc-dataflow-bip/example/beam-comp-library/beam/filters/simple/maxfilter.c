#ifndef BEAM_PARSE_SHIELD
#define START_ACT_LOOP {int act_idx; for (act_idx=0;act_idx<c;act_idx++){
#define END_ACT_LOOP }}
#endif


void METH(filterctrl, act) (int c){
  int z,i;

START_ACT_LOOP
    z = CALL(input, get)();
    if (z >= PRIVATE.max){
      PRIVATE.max = z;
    }
    
    CALL(output, put)(PRIVATE.max);
END_ACT_LOOP  
}
