package PrintWriterMain;

public class PhoneDTO {
	String number;
	String name;
	String phoneNum;
	int	   regNum;
	
	public PhoneDTO(String number, String name, String phoneNum, int regNum) {
		this.number	 	= number;
		this.name 		= name;
		this.phoneNum	= phoneNum;
		this.regNum		= regNum;
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
	public int getregNum() {
		return regNum;
	}
	public void setregNum(int regNum) {
		this.regNum = regNum;
	}
	@Override
	public String toString() {
		return number + name+ phoneNum+regNum;
	
	
	}
}
