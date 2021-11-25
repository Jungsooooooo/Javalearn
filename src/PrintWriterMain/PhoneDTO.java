package javalearn;

public class PhoneDTO {
	String number;
	String name;
	String phoneNum;
	
	public PhoneDTO(String number, String name, String phoneNum) {
		this.number	 	= number;
		this.name 		= name;
		this.phoneNum	= phoneNum;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return number + name+ phoneNum;
	
	
	}
}
