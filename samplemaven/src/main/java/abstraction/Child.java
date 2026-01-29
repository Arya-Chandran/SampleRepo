package abstraction;

public class Child extends Parent {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.display();
		ob.print();
		ob.show();
	}

	@Override
	public void display() {
		System.out.println("Child");
		
	}
		
	public void show()
	{
		System.out.println("Show");
	}

}