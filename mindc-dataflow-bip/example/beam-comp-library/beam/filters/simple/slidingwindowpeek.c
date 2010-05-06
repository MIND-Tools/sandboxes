void METH(filterctrl, act) (int c){
  int z;
  int m = 0;
  int w = 1;
  int i,j;

  for (i=0; i<c; i++){

    for (j=0; j<ATTR(width); j++){
      m = (CALL(input, peek)(j) + m*j)/(j+1);
    }
    CALL(input, get)();
    
    CALL(output, put)(m);
  }
}
