package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class ToStringPrint {

	public static void main(String[] args) {
		//Q.생성자 메서드를 통해 PersonVO객체에 원하는 이름,나이,전화번호를 저장하고 toString() 메서드를 출력하세요.
		PersonVO vo = new PersonVO("홍길동", 11, "010-1111-1111");
		
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getPhone());
		
		System.out.println(vo.toString());
	
	}
	
}
