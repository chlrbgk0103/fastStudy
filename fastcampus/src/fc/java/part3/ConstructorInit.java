package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class ConstructorInit {
	public static void main(String[] args) {
		//Q. ������ �޼��带 ���� PersonVO ��ü�� �̸�, ����, ��ȭ��ȣ�� ��ȭ ����Ͻÿ�.
		
		PersonVO vo = new PersonVO();
		
		String nameC = vo.getName();
		int ageC = vo.getAge();
		String phoneC = vo.getPhone();
		
		System.out.println(nameC);
		System.out.println(ageC);
		System.out.println(phoneC);
		
	}
}
