/**
	* Copyright (c) 2017 Mian Safyan Shah
	*
	* WRITTEN BY	: MIAN SAFYAN SHAH
	* CONTACT	: safyanshah@live.com
	*
	* This program demonstrates the use of Variables in Java.
	*
	* Use the command line to compile and run this program. It'll run in any IDE but 
	* using command line is preferred.
	*
	* How to compile : Open Command Prompt on Windows or Terminal on Mac OS/Linux/Unix
	* then navigate to the directory of this program and type the following command
	*
	* javac JavaVariables.java
	*
	* How to Run : after successful compilation, type java JavaVariables, you'll see output
	* on the command line.
	*
	*
  */
  
  class JavaVariables
  {
  	public static void main(String[] args)
  	{
  		byte b = 127;		// FROM -128 to 127
  		short s = 32767;	// FROM -32768 to 32767
  		int i = 100;		// FROM -2 RAISE TO THE POWER 31 TO MAX 2 RAISE TO THE POWER 31 -1
  		long l = 100;		// FROM -2 RTTP 63 TO MAX 2 RTTP 63 - 1
  		float f = 121; 		// IS 32-BIT BEST FOR SAVING MEMORY
  		double d = 433.54;	// SAME AS FLOATING POINT BUT TAKES MORE MEMORY
  		boolean bo = false; // TRUE OR FALSE
  		char c = 'C';		// HOLDS Character VALUE
	  		
	  	// HOW TO USE THESE VARIABLES
  		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
  		
  		System.out.println("b is : " + b);
  		System.out.println("s is : " + s);
  		System.out.println("i is : " + i);
  		System.out.println("l is : " + l);
  		System.out.println("f is : " + f);
  		System.out.println("d is : " + d);
  		System.out.println("bo is : " + bo);
  		System.out.println("c is : " + c);
  		
  		System.out.println("creditCardNumber is : " + creditCardNumber);
  		System.out.println("socialSecurityNumber is : " + socialSecurityNumber);
  		System.out.println("pi is : " + pi);
  		System.out.println("hexBytes is : " + hexBytes);
  		System.out.println("hexWords is : " + hexWords);
  		System.out.println("maxLong is : " + maxLong);
  		System.out.println("nybbles is : " + nybbles);
  		System.out.println("bytes is : " + bytes);
  	}
  }
