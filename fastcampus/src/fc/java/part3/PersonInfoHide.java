package fc.java.part3;

import fc.java.part3.dto.PersonVO;

public class PersonInfoHide {
	public static void main(String[] args) {
		//Q. �ѻ���� [ȸ�� ����!]�� ������ [��ü�� ����!]�Ͻÿ�.
		
		PersonVO vo = new PersonVO();
		
		String thisN = vo.getName();
		int thisA = vo.getAge();
		String thisP = vo.getPhone();
		
		System.out.println(thisN);
		System.out.println(thisA);
		System.out.println(thisP);
		
		
	}
}
