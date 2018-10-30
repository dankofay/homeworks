package test1;

public class FirstHw {

	public static void main(String[] args) {
		double a=0;
		double b=1;
		double c=0;
		
	for (int i=3; i<=9; i=i+1) {
		double	a1=2;
	    a= a+Math.pow(i, a1);	}

	
	for (int j=2; j<=8; j=j+1) {		
		b=b*j;		
	}
	
    c=a+b;
    
	System.out.println("сума квадратів дорівнює "+ a);
	System.out.println( "добуток чисел дорівнює " + b);
	System.out.println("сума а+b доівнює " + c);
	}
	
}

