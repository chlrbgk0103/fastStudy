package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class ConstructorOverroding {

	public static void main(String[] args) {
		//Q.�����ڸ޼��带 ���� PersonVO��ü�� ���ϴ� �̸�,����,��ȭ��ȣ�� ���� ��� �Ͻÿ�.
		PersonVO vo = new PersonVO();
		
		PersonVO vo1 = new PersonVO("ȫ", 0, "010-1");
	
	
		System.out.println(vo.getName());
		System.out.println();
		System.out.println(vo1.getName());
		System.out.println(vo1.getAge());
		System.out.println(vo1.getPhone());
		
		
	
	}
	
	
	
	
}
