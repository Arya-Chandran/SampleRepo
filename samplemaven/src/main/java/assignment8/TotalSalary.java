package assignment8;

public class TotalSalary extends CalculateSalary {
	double totalSalary;
	void totalSalaryCalculation() {
	 totalSalary= basicpay+hra-pf-deduction+bonus;
	}

}
