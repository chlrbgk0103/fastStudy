package fc.java.part3;

import fc.java.part3.dao.PersonDAO;
import fc.java.part3.dto.PersonDTO;

public class PersonAccessTest {

	public static void main(String[] args) {
		
		//Q.Person Ŭ�������� �̸�,����,��ȭ��ȣ�� �����ϰ� ����Ͻÿ�.
		PersonDTO person = new PersonDTO();	
		PersonDAO dao = new PersonDAO();
		
		/********** ��� **********/
		dao.personPrint(person);
		
	}

	
}
