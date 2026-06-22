package ¿Ã¿±º≠;

public class p58_InDecOperation {
	
	public static void main(String[]args) {
		int a,b,c,d;
		
		a=3; b=5; c=6;
		d= a++ + b++ - c--;
		d= a + b - c;
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
		
		a=3; b=5; c=6;
		d= ++a + ++b - --c;
		d= (1+a) + (1+b) - (c-1);
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
		
		a=3; b=5; c=6;
		d= ++a + b++ - --c;
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
	}

}
