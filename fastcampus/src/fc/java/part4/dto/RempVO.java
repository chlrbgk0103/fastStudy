package fc.java.part4.dto;


import fc.java.part4.Employee;

//** ����� ����ϸ� ����Ŭ������ ����Ŭ������ ��Ȱ�� �����ϴ�. **//
// -- ����Ŭ������ ����Ŭ������ �����Ͽ� ��� ���� -- //

// �� �� �� �� (VO, DTO) 
public class RempVO extends Employee{
	
	public static void main(String[] args) {
		Employee vo = new Employee();
		
		System.out.println(vo.toString());
	}
	
	public RempVO() {
		super();
	}
	
	public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
		super(name,age,phone,empDate,dept,marriage);
	}	
//** �ʱ�ȭ(�ڽ��� �θ��� �������� �ʱ�ȭ�� �ϴ� ���) **//
/*	
	public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
		this.name     = name;
		this.age      = age;
		this.phone    = phone;
		this.empDate  = empDate;
		this.dept     = dept;
		this.marriage = marriage;
	}
*/	

}
