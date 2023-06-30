package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class ConstructorInit {
	public static void main(String[] args) {
		//Q. 생성자 메서드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 전화 출력하시오.
		
		PersonVO vo = new PersonVO();
		
		String nameC = vo.getName();
		int ageC = vo.getAge();
		String phoneC = vo.getPhone();
		
		System.out.println(nameC);
		System.out.println(ageC);
		System.out.println(phoneC);
		
	}
}
