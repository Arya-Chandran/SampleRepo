package assignment12;

public class SetUser {
	private int pin;
	public void setter(int pin)
	{
		this.pin=pin;
	}

	public void getter()
	{
		System.out.println("Pin is:" +pin);
	
	}
	
	public void validPin() {
		if ((pin==1001)||(pin==1234)||(pin==1212))
		{
			System.out.println("This is a Valid Pin");
		}
		else
		{
			System.out.println("This is an Invalid Pin");
		}
	}
	

}
