package aggregation;


public class Aggregation2 {
	
	String city, state;
	Aggregation1 var;
	public Aggregation2(String city,String state, Aggregation1 var) {
		this.city=city;
		this.state=state;
		this.var=var;
	}
	public void display()
	{
		System.out.println(var.name);
		System.out.println(var.rollno);
		System.out.println(var.addr);
		System.out.println(city);
		System.out.println(state);
	}
	public static void main(String[] args) {
		Aggregation1 obj1= new Aggregation1("Arya",12,"northrop");
		Aggregation2 obj2= new Aggregation2("Kochi","kerala",obj1);
		obj2.display();
	}

}
