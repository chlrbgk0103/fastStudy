package fc.java.part4.dto;


import fc.java.part4.Employee;

//** 상속을 사용하면 하위클래스가 상위클래스를 재활용 가능하다. **//
// -- 하위클래스가 상위클래스를 접근하여 사용 가능 -- //

// 일 반 사 원 (VO, DTO) 
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
//** 초기화(자식이 부모의 기억공간에 초기화를 하는 경우) **//
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
