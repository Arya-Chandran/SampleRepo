package interfaceExample;

public class Interface2 implements Interface1{
	
	public void show()
	{
		System.out.println("Show");
	}

	public static void main(String[] args) {
		Interface2 obj= new Interface2();
		obj.show();
		obj.display();
		obj.print();
		//reference creation
		Interface1 ref=new Interface2();
		ref.display();
		ref.print();

	}

	@Override
	public void display() {
		
		System.out.println("Display");
	}

	@Override
	public void print() {
		System.out.println("Print");
	}

}
