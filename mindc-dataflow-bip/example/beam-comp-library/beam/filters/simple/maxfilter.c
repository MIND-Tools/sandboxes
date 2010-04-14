void METH(filterctrl, act) (int c){
  int z,i;

  for (i=0;i<c;i++){
    z = CALL(input, get)();
    if (z >= PRIVATE.max){
      PRIVATE.max = z;
    }
    
    CALL(output, put)(PRIVATE.max);
  }
}
