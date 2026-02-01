package exceptionHandling;

public class Example {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=10/0;
		}
//		catch(ArithmeticException e) {
//			b=5;
//			int c= a/b;
//			System.out.println(c);
//			System.out.println(e);
//			
//		}
		
		finally {
			System.out.println("Hello");
		}
		
	
	}

}
