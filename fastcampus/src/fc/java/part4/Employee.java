package fc.java.part4;

// -- 사 원 (VO, DTO) -- 
public class Employee{

//** protected - 상속관계에서 하위클래스가 상위클래스의 접근을 허용하는 접근권한 **//
	private String name;
	private int age;
	private String phone;
	private String empDate;
	private String dept;
	private boolean marriage;
	
// super - 상위클래스의 생성자를 호출 -> new Object() 에 의헤 생성 new Object() 는 생략가능
	public Employee() {
		super();
	}

	public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
		super();
		this.name = name;
		this.age  = age;
		this.phone    = phone;
		this.empDate  = empDate;
		this.dept     = dept;
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phone=" + phone + ", empDate=" + empDate + ", dept="
				+ dept + ", marriage=" + marriage + "]";
	}
}
	