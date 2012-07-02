#include <stdio.h>

// -----------------------------------------------------------------------------
// Implementation of the primitive components.Server.
// -----------------------------------------------------------------------------


int METH(getNbMeters)() {

	return ATTR(nbMeters);

}



void METH(service,setMeter)(int meterIndex, int newValue) {

	int nbMeters = CALL(getNbMeters)();

	if ((meterIndex >= (nbMeters)) || (meterIndex < 0)) {
		printf("Wrong index\n");
		return;
	}
	else {
		CALL(control[meterIndex],set)(newValue);
	}

}


int METH(service,getMeter)(int meterIndex) {

	int nbMeters = CALL(getNbMeters)();

	if ((meterIndex >= (nbMeters)) || (meterIndex < 0)) {
		printf("Wrong index\n");
		return;
	}
	else {
		return CALL(control[meterIndex],get)();
	}

}


int* METH(service,getAllMeters)(){

	int i;
	int* values;
	int nbMeters = CALL(getNbMeters)();

	values = (int*) malloc((nbMeters+1)*sizeof(int));

	values[0] = nbMeters;

	for (i=0 ; i < nbMeters ; i++) {
		values[i+1] = CALL(control[i],get)();
	}

	return values;
}
