// int main(int argc, string[] argv)
int METH(main, main) (int argc, char *argv[]){

  // call the 'print' method of the 'sa' client interface.
  CALL(client, act)(1);

  // call again the same method to look at invocation count
  CALL(server, act)(1);

  return 0;
}
