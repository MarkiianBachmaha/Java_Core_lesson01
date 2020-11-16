package homework01;

public class Homework01 {
public static void main(String[] args) {
	
	byte a = 1;
	short b = 2;
	char c = 3;
	int d = 4;
	long e = 5;
	float f = 6.6F;
	double g = 7.7;
	boolean h = true;
	
	System.out.println("BYTE = " + Byte.MAX_VALUE);
	System.out.println("BYTE = " + Byte.MIN_VALUE);
	System.out.println("SHORT = " + Short.MAX_VALUE);
	System.out.println("SHORT = " + Short.MIN_VALUE);
	System.out.println("CHAR = " + Character.MAX_VALUE);
	System.out.println("CHAR = " + Character.MIN_VALUE);
	System.out.println("INT = " + Integer.MAX_VALUE);
	System.out.println("INT = " + Integer.MIN_VALUE);
	System.out.println("LONG = " + Long.MAX_VALUE);
	System.out.println("LONG = " + Long.MIN_VALUE);
	System.out.println("FLOAT = " + Float.MAX_VALUE);
	System.out.println("FLOAT = " + Float.MIN_VALUE);
	System.out.println("DOUBLE = " + Double.MAX_VALUE);
	System.out.println("DOUBLE = " + Double.MIN_VALUE);
	System.out.println("BOOLEAN = " + Boolean.FALSE);
	System.out.println("BOOLEAN = " + Boolean.TRUE);
	
	int [] array1 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
	int max = array1[0];
	int min = array1[0];
	
	for (int m = 0; m != array1.length; m++) {
		if(array1[m] > max) {
			max = array1[m];
		}
		if(array1[m] < min) {
			min = array1[m];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
