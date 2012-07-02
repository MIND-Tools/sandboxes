// -----------------------------------------------------------------------------
// Implementation of the primitive components.Meter.
// -----------------------------------------------------------------------------

void METH(control,set)(int newValue) {

	PRIVATE.value = newValue;

}


int METH(control,get)() {

	return PRIVATE.value;

}
