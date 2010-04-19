void METH(filterctrl, act) (int c){
  int z;
  int m = 0;
  int w = 1;
  int i,j;

  if (!PRIVATE.init_hack){
    int i;
    PRIVATE.init_hack = 1;
    for (i=0; i<256; i++)
      PRIVATE.history[i]=0;
  }

  for (i=0; i<c; i++){
    z = CALL(input, get)();
#ifdef BEAM_DEBUG
    printf("SW: input = %d\n", z);
#endif
    PRIVATE.history[PRIVATE.ptr] = z;

    for (j=0; j<256; j++){
      m = (PRIVATE.history[j] + m*j)/(j+1);
    }
#ifdef BEAM_DEBUG
    printf("SW: output = %d\n", m);
#endif
    CALL(output, put)(m);
    PRIVATE.ptr = (PRIVATE.ptr+1)%256;
  }
}
