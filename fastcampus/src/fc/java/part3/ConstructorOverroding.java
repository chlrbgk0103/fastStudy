package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class ConstructorOverroding {

	public static void main(String[] args) {
		//Q.생성자메서드를 통해 PersonVO객체에 원하는 이름,나이,전화번호를 저장 출력 하시오.
		PersonVO vo = new PersonVO();
		
		PersonVO vo1 = new PersonVO("홍", 0, "010-1");
	
	
		System.out.println(vo.getName());
		System.out.println();
		System.out.println(vo1.getName());
		System.out.println(vo1.getAge());
		System.out.println(vo1.getPhone());
		
		
	
	}
	
	
	
	
}
