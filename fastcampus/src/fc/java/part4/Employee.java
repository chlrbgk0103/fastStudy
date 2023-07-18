package fc.java.part4;

// -- �� �� (VO, DTO) -- 
public class Employee{

//** protected - ��Ӱ��迡�� ����Ŭ������ ����Ŭ������ ������ ����ϴ� ���ٱ��� **//
	private String name;
	private int age;
	private String phone;
	private String empDate;
	private String dept;
	private boolean marriage;
	
// super - ����Ŭ������ �����ڸ� ȣ�� -> new Object() �� ���� ���� new Object() �� ��������
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
	