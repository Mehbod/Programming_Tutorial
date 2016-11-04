import java.util.Scanner;

public class Circle {
	static double p=3.1415923;
	//TODO: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.

public static double methoddiameter(double circle) {
	double d;


	d=(2*circle);

	
	return d;
}	
public static double methodcircumference(double circle) {


	double a;

	a=((circle*circle)*p);
	
	return a;
}
public static double methodarea(double circle) {
	double c;
	c=(2*p*circle);

	
	return c;
}


public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	double x = scan.nextDouble();
	
	double a,c,d;
	
	d=methoddiameter(x);
	c=methodcircumference(x);
	a=methodarea(x);
	
	System.out.println(d);
	System.out.println(c);
	System.out.println(a);
}

	
}