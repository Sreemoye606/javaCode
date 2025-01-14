/*
Create a class that will apply a tax of 10% to the basic salary and give a bonus of 2% of basic salary
    and add a travelling allowance of 1.5% of basic salary. Now find the annual salary of the employee.
	*/

import lombok.*;

class Salary{
	@Getter
	@Setter
	private String empName;
	
	@Getter
	@Setter
	private double baseSal;
	
	@Getter
	private double annualSal;
	
	void tax(){
		this.annualSal = this.baseSal - (10.0/100.0)*baseSal;
	}
	void bonus(){
		this.annualSal = this.annualSal + (2/100)*this.annualSal;
	}
	void allowance(){
		this.annualSal = this.annualSal + (1.5/100)*this.annualSal;
		
	}
	
}


class Q10_salaryTax{
	public static void main(String[] args){
		Salary emp = new Salary();
		emp.setEmpName("Rimita");
		emp.setBaseSal(12000);
		
		emp.tax();
		emp.bonus();
		emp.allowance();
		
		System.out.println("Employee name : "+emp.getEmpName());
		System.out.println("Base salary = "+emp.getBaseSal());
		System.out.println("Annual salary = "+emp.getAnnualSal());
		
	}
}