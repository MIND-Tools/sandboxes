void METH(filterctrl, act) (int c){
  int i;
  dualint_t z;

  for(i=0; i<c; i++){
    z = CALL(input,get)();
#ifdef BEAM_DEBUG
    printf("forker: input = {x:%d; y:%d}\n", z.x, z.y);
    printf("forker: output1 = %d\n", z.x);
    printf("forker: output2 = %d\n", z.y);
#endif
    CALL(output1, put)(z.x);
    CALL(output2, put)(z.y);
  }
}
