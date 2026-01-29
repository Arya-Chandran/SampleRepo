package assignment7;

public class FactorialNumber {
	int a;
	
	public int calculateFactorial() {
		int fact=1;
		 for (int i = 1; i <= a; i++) {
	            fact = fact * i;
	        }
	        return fact;
		
	}
	
	public void print(int a) {
		this.a=a;
		int result= this.calculateFactorial();
		System.out.println("Factorial of " + a + " is: " + result);
	}
	

	public static void main(String[] args) {
		FactorialNumber obj= new FactorialNumber();
        obj.print(5);
	}

}
