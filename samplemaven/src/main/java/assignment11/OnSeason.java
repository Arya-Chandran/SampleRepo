package assignment11;

public class OnSeason extends OffSeason {
	 
	public void discount(double amount) {
		super.discount(amount);
		double discount=0.4*amount;
		double total=amount-discount;
		System.out.println("Offseason Discount-(40%)");
	    System.out.println("Amount after discount: " + total);
			
		}

	public static void main(String[] args) {
		OnSeason obj=new OnSeason();
		obj.discount(5000);

	}

}
