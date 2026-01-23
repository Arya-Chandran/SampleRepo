package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild()
	{
		super(3,4);
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		SuperConstructorChild ob= new SuperConstructorChild();

	}

}
