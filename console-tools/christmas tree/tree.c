#include <stdio.h>

int main(int argc, char *argv[]) {
	/* defines the height of the tree (number of rows) */
	int height = 7;
	/* defines the trunk of the tree (number of rows) */
	int trunkheight = 2;

	/* use given program parameter for height and trunkheight if present */
	if(argc == 3) {
		height = atoi(argv[1]);
		trunkheight = atoi(argv[2]);
	}

	//loop variables
	int c = 0, r = 0;
	
	/** print tree */
	for(r = 0; r < height; r++) {
		for(c = 0; c < (height * 2 - 1); c++) {
			if(c >= (height - r - 1) && c <= (height + r -1))
				printf("*");
			else
				printf(" ");
		}
		printf("\n");
	}

	/** print trunk */
	for(r = 0; r < trunkheight; r++) {
		for(c = 0; c < height - 2; c++) {
			printf(" ");
		}
		printf("***\n");
	}
};