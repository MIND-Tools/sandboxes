void METH(filterctrl, act) (int c){
  int i;
  int z;

  for(i=0; i<c; i++){
    z = CALL(input,get)();
    printf("%d\n", z);
  }
}
