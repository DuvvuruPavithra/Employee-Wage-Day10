package com.bridgelabz.employeewage;

public class EmployeeWageUsingInterfaceApproachUc11 implements calculateEmployeeWage  {
	private int numOfCompany = 0;
	private  CompanyEmpWage[] array = new CompanyEmpWage[5];
	
	public void addCompanyEmpWage(String company,int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
		array[numOfCompany] = new  CompanyEmpWage( company, empRatePerHour, numberOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
public void computeEmpWage() {
		
		for(int i = 0 ; i < numOfCompany ; i++) {
			array[i].setTotalEmpWage(this.computeEmpWage(array[i]));
			System.out.println(array[i]);
		}
	}

private int computeEmpWage(CompanyEmpWage companyEmpWage) {
	int workingHour = 0;
	int empWorkingHour=0;
	int totalWorkingDay = 0;
	int noOfdays = 0;
	int totalWorkingPerHour = 0;
	int empRatePerHour = 0;
	
	while(totalWorkingDay <= noOfdays && totalWorkingPerHour < empRatePerHour) {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int Check = (int)empCheck;
		switch(Check) {
		case 1:
			workingHour = 8;
			break;
		case 2 :
			workingHour = 4;
			break;
		default : 
			workingHour = 0;
			break;
		}
		
		totalWorkingPerHour+=empWorkingHour;
		System.out.println("Day :"+totalWorkingDay);
		System.out.println("Total Employee working hour  is  : " + empWorkingHour);

	}
	int totalEmployeewage = totalWorkingPerHour * empRatePerHour;
	System.out.println("Total Employee Wage is :"+totalEmployeewage);
	System.out.println("Total working hours are  : " + totalWorkingPerHour);
	return totalEmployeewage;
}

	public static void main(String[] args) {
		calculateEmployeeWage empWage = new EmployeeWageUsingInterfaceApproachUc11();
		empWage.addCompanyEmpWage("TechMahindra", 20, 2, 10);
		empWage.addCompanyEmpWage("Wipro", 10, 2, 10);
		empWage.computeEmpWage();	
	}

}
