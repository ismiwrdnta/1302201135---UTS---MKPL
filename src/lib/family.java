package lib;
import java.util.LinkedList;
import java.util.List;

public class family {
    private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

    public family(String spouseName, String spouseIdNumber, List<String> childNames,
    List<String> childIdNumbers) {
		this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
		
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}

    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = spouseIdNumber;
	}

    public String getSpouseName() {
        return spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}

    public int getchildIdNumber(){
        return childIdNumbers.size();
    }
	
}
