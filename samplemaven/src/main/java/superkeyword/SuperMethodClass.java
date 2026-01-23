package superkeyword;

public class SuperMethodClass extends SuperMethodParent{
	public void display()
	{
		System.out.println("I am child");
		super.display();
	}

	public static void main(String[] args) {
		SuperMethodClass obj= new SuperMethodClass();
        obj.display();
	}

}
