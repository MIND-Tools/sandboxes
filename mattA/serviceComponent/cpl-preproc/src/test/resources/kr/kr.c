#include "data.h"

// declaration of the private method.
int METH(myPrivateMethod)(int a);

// Kardigan & Richie declaration of METHOD
int METH(myItf, myMethod)(a, b)
	int a;
	int b;
{
	PRIVATE.a = a;
	PRIVATE.b = b;
	return CALL(myPrivateMethod)(b);
}

int METH(myPrivateMethod)(int a) {
	return PRIVATE.a + a;
}