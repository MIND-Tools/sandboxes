void METH(filterctrl, act) (int c){
  int i;
  dualint_t z;

  for(i=0; i<c; i++){
    z = CALL(input,get)();
    printf("%d %d\n", z.x, z.y);
#ifdef BEAM_DEBUG
    printf("dumper: input = {x:%d; y:%d}\n", z.x, z.y);
#endif
  }

}
