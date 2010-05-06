void METH(filterctrl, act) (int c){
  int i;
  int z1,z2,z3;

  for(i=0; i<c; i++){
    z1 = CALL(input1,get)();
    z2 = CALL(input2,get)();
    z3 = CALL(input3,get)();

    printf("%d %d %d\n", z1, z2, z3);
  }
}
