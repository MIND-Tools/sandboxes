void METH(filterctrl, act) (int c){
  int z;
  z = CALL(input, get)();
  if (z >= PRIVATE.max){
    PRIVATE.max = z;
  }
  
  CALL(output, put)(PRIVATE.max);
}
