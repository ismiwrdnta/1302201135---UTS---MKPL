package lib;
import java.time.LocalDate;
import java.time.Month;

public class dateWork extends salary {
    private LocalDate dateJoin;
	

    public dateWork() {
    }

    public dateWork(LocalDate dateJoin) {
        this.dateJoin = dateJoin;
    }

    public LocalDate getDateJoin() {
        return dateJoin;
    }
    public void setDateJoin(LocalDate dateJoin) {
        this.dateJoin = dateJoin;
    }

    public int getMonth(){
        return dateJoin.getMonthValue();
    }
    public int getYear(){
        return dateJoin.getYear();
    }
}
