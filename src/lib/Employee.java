package lib;

import java.time.LocalDate;
import java.time.Month;


public class Employee {	
	private person Person;
	private family Family;
	private salary Salary;
	private dateWork WorkDate;
	
	public Employee(person person, family family, salary salary, dateWork WorkDate) {
		this.Person = person;
		this.Family = family;
		this.Salary = salary;
		this.WorkDate = WorkDate;
	}

	private int monthWorkingInYear;

	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == WorkDate.getYear()){
			monthWorkingInYear = date.getMonthValue() - WorkDate.getMonth();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(Salary.getMonthlySalary(), Salary.getOtherMonthlyIncome(), monthWorkingInYear, Salary.getAnnualDeductible(), Family.getSpouseIdNumber().equals(""), Family.getchildIdNumber());
	}
}
