package inheritance;

public class Multilevelchild extends Multilevelparent{
	public void childdisplay()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Multilevelchild obj= new Multilevelchild();
		obj.childdisplay();
		obj.parentdisplay();
		obj.granddisplay();
	}

}
