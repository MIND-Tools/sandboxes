#include <stdio.h>

// -----------------------------------------------------------------------------
// Implementation of the primitive components.IHM.
// -----------------------------------------------------------------------------



void METH(showMeter)(int meterIndex) {

	int value;

	value = CALL(admin,getMeter)(meterIndex);

	printf("meter %d = %d\n", meterIndex, value);

}

void METH(showAllMeters)() {

	int* values;
	int nbMeters = 0;
	int i;

	values = CALL(admin,getAllMeters)();
	nbMeters = values[0];

	for (i=0 ; i < nbMeters ; i++) {
		printf("meter %d = %d\n", i, values[i+1]);
	}

}

void METH(setMeter)(int meterIndex, int newValue) {

	CALL(admin,setMeter)(meterIndex, newValue);

}


int METH(main,main)(int argc, char *argv[]) {

	int exit = 0;
	int prompt = 0;
	int value = 0;
	int index = 0;

	while(!exit) {

		printf("1: show a meter's value\n2: set a meter's value\n3: exit\n");
		scanf("%d",&prompt);

		switch(prompt) {
		case 1:
			printf("Enter meter's index (-1 for all meters)\n");
			scanf("%d",&index);
			switch(index) {
			case -1:
				CALL(showAllMeters)();
				break;
			default :
				CALL(showMeter)(index);
				break;
			}
			break;
		case 2:
			printf("Enter meter's index\n");
			scanf("%d",&index);
			printf("Enter meter's new value\n");
			scanf("%d",&value);
			CALL(setMeter)(index, value);
			break;
		case 3:
			exit = 1;
			break;
		default:
			printf("Wrong value\n");
			break;
		}
	}
	return 0;
}
