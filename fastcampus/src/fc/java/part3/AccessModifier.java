package fc.java.part3;

import fc.java.part3.dao.MemberDAO;
import fc.java.part3.dao.PersonDAO;
import fc.java.part3.dto.MemberDTO;
import fc.java.part3.dto.PersonDTO;

public class AccessModifier {

	public static void main(String[] args) {
		//Q.AccessModifier를 이용해서 클래스 간에 상호 접근하는 방법을 실습해보자
		
		/********** PERSON **********/
		PersonDTO pDTO = new PersonDTO();
		PersonDAO pDAO = new PersonDAO();
		
		pDAO.personPrint(pDTO);

		/********** MEMBER **********/
		MemberDTO mDTO = new MemberDTO();	
		MemberDAO mDAO = new MemberDAO();
		
		mDTO.name  = "홍";
		mDTO.phone = "010-";

		mDAO.eat();
		
	}
	
}
