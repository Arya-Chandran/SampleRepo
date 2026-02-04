package assignment7;

public class ReverseNumber {
	int a;
	int r=0;
	
	public ReverseNumber()
	{
		System.out.println("Finding reverse");
	}
	
	public ReverseNumber(int a)
	{
		this();
		//this.a=a;
		
		 int temp = a;
	        while (temp != 0) {
	            r = r * 10 + temp % 10;
	            temp = temp / 10;
	        }

	        System.out.println("Reverse of " + a + " is: " + r);
	}



	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber(5674);
	}

}
