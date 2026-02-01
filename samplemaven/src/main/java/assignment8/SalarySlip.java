package assignment8;

public class SalarySlip extends TotalSalary{
	
	void printSalarySlip() {
		System.out.println("Basic Pay  : " + basicpay);
        System.out.println("HRA        : " + hra);
        System.out.println("PF         : " + pf);
        System.out.println("Deduction  : " + deduction);
        System.out.println("Bonus      : " + bonus);
        System.out.println("Total Pay  : " + totalSalary);
	}


	public static void main(String[] args) {
		SalarySlip obj= new SalarySlip();
		obj.basicEmployeeDetails(40000, 3000, 2000);
		obj.calculate();
		obj.totalSalaryCalculation();
	    obj.printSalarySlip();

	}

}
