package com.bridgelabz.employeewage;

import java.util.ArrayList;

public  class EmployeeWageUsingArrayListUc12 implements calculateEmployeeWage{
	private int numOfCompany = 0;
	private  ArrayList<CompanyEmpWage> arraylist  = new ArrayList<>();
	
	public void addCompanyEmpWage(String company,int empRatePerHour,int numberOfWorkingDays,int maxHoursPerMonth) {
		CompanyEmpWage companyEmp = new CompanyEmpWage(company,empRatePerHour,numberOfWorkingDays, maxHoursPerMonth );
				arraylist.add(companyEmp);
			}
	
   public void computeEmpWage() {
		
		for(int i = 0 ; i < arraylist.size() ; i++) {
			CompanyEmpWage company = arraylist.get(i);
			company.setTotalEmpWage(this.computeEmpWage(company));

			System.out.println(company);
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
		calculateEmployeeWage empWage = new EmployeeWageUsingArrayListUc12();
		empWage.addCompanyEmpWage("TechMahindra", 20, 2, 10);
		empWage.addCompanyEmpWage("Wipro", 10, 2, 10);
		empWage.computeEmpWage();	
	}

}
