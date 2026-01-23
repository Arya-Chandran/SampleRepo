package inheritance;

public class Heirarchicalchild2 extends Heirarchicalparent {
	public void displayChild2()
	{
		System.out.println("Heirarchical child2 class");
	}
	public static void main(String[] args) {
		Heirarchicalchild2 obj= new Heirarchicalchild2();
		obj.displayParent();
		obj.displayChild2();
	}

}
