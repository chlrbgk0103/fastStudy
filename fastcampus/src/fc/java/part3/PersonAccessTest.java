package fc.java.part3;

import fc.java.part3.dao.PersonDAO;
import fc.java.part3.dto.PersonDTO;

public class PersonAccessTest {

	public static void main(String[] args) {
		
		//Q.Person 클래스에서 이름,나이,전화번호를 저장하고 출력하시오.
		PersonDTO person = new PersonDTO();	
		PersonDAO dao = new PersonDAO();
		
		/********** 출력 **********/
		dao.personPrint(person);
		
	}

	
}
