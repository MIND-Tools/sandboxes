void METH(filterctrl, act) (int c){
  int i;

  for (i=0; i<c; i++){

    int z = CALL(input, get)();
    
    CALL(output1, put)(z);
    CALL(output2, put)(z);
    CALL(output3, put)(z);
  }
}
