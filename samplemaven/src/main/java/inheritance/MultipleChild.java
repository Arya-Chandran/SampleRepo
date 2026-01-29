package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2 {
	
	public void show() {
		System.out.println("Show");
		
	}
	public static void main(String[] args) {
		MultipleChild obj= new MultipleChild();
		obj.show();
		obj.display();
		obj.print();

	}

	@Override
	public void print() {
		System.out.println("Print");
		
	}

	@Override
	public void display() {
		System.out.println("Display");
		
	}

}
