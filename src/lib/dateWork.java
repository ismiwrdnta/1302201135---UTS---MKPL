package lib;
import java.time.LocalDate;
import java.time.Month;

public class dateWork extends salary {
    private LocalDate dateJoin;
	private int monthWorkingInYear;

    public dateWork() {
    }

    public dateWork(LocalDate dateJoin, int monthWorkingInYear){
        this.dateJoin = dateJoin;
        this.monthWorkingInYear = monthWorkingInYear;
    }
    public LocalDate getDateJoin() {
        return dateJoin;
    }
    public void setDateJoin(LocalDate dateJoin) {
        this.dateJoin = dateJoin;
    }
    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }
    public void setMonthWorkingInYear(int monthWorkingInYear) {
        this.monthWorkingInYear = monthWorkingInYear;
    }

}
