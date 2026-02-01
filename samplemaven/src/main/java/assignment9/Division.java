package assignment9;

public class Division extends Addition {

	public void divisionCalculation(int a, int b) {
		int sum= super.additionCalculation(a,b);
				if (sum%10==0)
				{
					 System.out.println("The addition result is divisible by 10");	
				}
				else {
					System.out.println(" The addition result is not divisible by 10");	
				}
		
		
	}

	public static void main(String[] args) {
		Division obj= new Division();
		obj.divisionCalculation(30,35);
	}

}
