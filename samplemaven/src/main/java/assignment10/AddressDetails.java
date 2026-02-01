package assignment10;

public class AddressDetails {
	
	String addr;
	StudentDetails var;
	public AddressDetails(String addr,StudentDetails var) {
		this.addr=addr;
		this.var=var;
	}
	 public void display() {
		 System.out.println(var.name);
		 System.out.println(var.rollnumber);
		 System.out.println(addr);
		 
	 }
	

	public static void main(String[] args) {
		StudentDetails obj1=new StudentDetails("Arya", 28);
		AddressDetails obj2=new AddressDetails("Kottayam", obj1);
		obj2.display();

	}

}
