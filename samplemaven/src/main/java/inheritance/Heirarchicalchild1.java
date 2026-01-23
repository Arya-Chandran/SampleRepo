package inheritance;

public class Heirarchicalchild1 extends Heirarchicalparent {
	
	public void displayChild1()
	{
		System.out.println("Heirarchical child1 class");
	}

	public static void main(String[] args) {
		Heirarchicalchild1 obj= new Heirarchicalchild1();
		obj.displayParent();
		obj.displayChild1();
	}

}
