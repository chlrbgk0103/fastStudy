package fc.java.part3.dto;

public class PersonVO {

	private String name;
	private int age;
	private String phone;

//********** 规过 1 : default 积己磊 **********//
	public PersonVO() {
		this.name  = "檬扁拳";
		this.age   = 111;
		this.phone = "010-1111";
	}
	
	public PersonVO(String name, int age, String phone) {
		this.name  = name;
		this.age   = age;
		this.phone = phone;
	}
	
//********** 规过 2 : getter,setter **********//	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;	
		return name;
	}
	public int getAge() {
		return age;
	}
	public int setAge(int age) {	
		this.age = age;
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String setPhone(String phone) {
		this.phone = phone;
		return phone;
	}

//********** toString **********//
	public String toString() {
		return name + "\t" + age + "\t" + phone;
	}
	
}

