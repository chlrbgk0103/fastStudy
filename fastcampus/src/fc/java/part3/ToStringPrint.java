package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class ToStringPrint {

	public static void main(String[] args) {
		//Q.������ �޼��带 ���� PersonVO��ü�� ���ϴ� �̸�,����,��ȭ��ȣ�� �����ϰ� toString() �޼��带 ����ϼ���.
		PersonVO vo = new PersonVO("ȫ�浿", 11, "010-1111-1111");
		
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getPhone());
		
		System.out.println(vo.toString());
	
	}
	
}
