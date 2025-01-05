package ex19;
import java.io.Serializable;

public class Ex19_19 {
	private static final long serialVersionUID = 1L;
	private String myName;
	private int myAge;
	
	public void Person(String myName, int myAge) {
		this.setMyName(myName);
		this.setMyAge(myAge);
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	
	

}
