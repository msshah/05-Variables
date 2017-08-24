/**
	*
	* Written by Mian Safyan Shah
	* Contact : safyanshah@live.com
	*
	* This program demonstrates the use of Variables in C.
	*
	* Use the command line to compile and run this program. It'll run in any IDE but 
	* using command line is preferred.
	*
	* How to compile : Open Command Prompt on Windows or Terminal on Mac OS/Linux/Unix
	* then navigate to the directory of this program and type the following command
	*
	* gcc -v CVariables.c -o CVariables
	*
	* How to Run : after successful compilation, type java JavaVariables, you'll see output
	* on the command line.
	*
	* ./CVariables
	*
	*
  */

#include <stdio.h>

int main(void)
{
	short s = 32767;	// FROM -32768 to 32767
	int i = 100;		// FROM -2 RAISE TO THE POWER 31 TO MAX 2 RAISE TO THE POWER 31 -1
	long l = 100;		// FROM -2 RTTP 63 TO MAX 2 RTTP 63 - 1
	float f = 121; 		// IS 32-BIT BEST FOR SAVING MEMORY
	double d = 433.54;	// SAME AS FLOATING POINT BUT TAKES MORE MEMORY
	char c = 'C';		// HOLDS Character VALUE. FROM -128 to 127 Character in Byte in C
  	
	// OUTPUT VARIABLES TO THE CONSOLE
	printf("Short is : %d.\n", s);
	printf("Int is : %d.\n", i);
	printf("long is : %ld.\n", l);
	printf("float is : %f.\n", f);
	printf("double is : %lf.\n", d);
	printf("char is : %c.\n", c);
}