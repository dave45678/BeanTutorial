package BeanTutorial;

import java.io.Serializable;

public class PhoneNumber implements Serializable{
	private String std;
	private String number;
	
	public String getNumber() {
		return number;
	}
	public String getStd() {
		return std;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setStd(String std) {
		this.std = std;
	}
}

