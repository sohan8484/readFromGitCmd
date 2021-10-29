package qsp;

public class Pract4 {
public static void main(String[] args) {
	System.out.println("main starts");
	String s="khan";
	try {
		@SuppressWarnings("unused")
		Integer i=new Integer(s);
		System.out.println(10/0);                                  
	} catch (ArithmeticException e) {
		System.out.println("arithmatic exception");
	}
	catch (NumberFormatException e) {
		System.out.println("number format exception");
	}
	System.out.println("ends");
}
}
