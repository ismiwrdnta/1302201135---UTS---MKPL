package lib;

public class TaxFunction {
	final static double percentage = 0.05;
	final static int maxNumberOfWorking = 12;
	final static int maxNumberOfChildren = 3;
	final static int deductionSingle = 54000000;
	final static int deductionMarried = 4500000;
	final static int deductionPerChild = 1500000;
	
	public static int calculateTax(int totalSalary, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		validateInput(numberOfMonthWorking);
		
		if (isMarried) {
			tax = (int) Math.round(percentage * (totalSalary - deductible - (deductionSingle + deductionMarried + (numberOfChildren * deductionPerChild))));
		}else {
			tax = (int) Math.round(percentage * (totalSalary - deductible - deductionSingle));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}

	}
	public static void validateInput(int numberOfMonthWorking) {
        if (numberOfMonthWorking > maxNumberOfWorking) {
            System.err.println("More than 12 month working per year");
        }
    }
	
}