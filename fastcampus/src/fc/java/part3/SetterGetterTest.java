package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class SetterGetterTest {

	
	public static void main(String[] args) {
		//Q.setter, getter 메서드를 통해 PersonVO 객체를 이름,나이,전화번호를 저장과 출력을 하시오.
		PersonVO vo = new PersonVO();
		
		String name  = vo.setName("2");
		int age      = vo.setAge(222222);
		String phone = vo.setPhone("010-");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
	}
	
	
}
