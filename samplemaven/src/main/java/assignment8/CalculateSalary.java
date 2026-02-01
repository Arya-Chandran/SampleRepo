package assignment8;

public class CalculateSalary extends BasicEmployee{
	double hra;
	double pf;
	
	void calculate() {
	 hra= 0.05*basicpay;
	 pf=0.2*basicpay;
	}
}
