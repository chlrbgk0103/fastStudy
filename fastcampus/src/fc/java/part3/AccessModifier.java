package fc.java.part3;

import fc.java.part3.dao.MemberDAO;
import fc.java.part3.dao.PersonDAO;
import fc.java.part3.dto.MemberDTO;
import fc.java.part3.dto.PersonDTO;

public class AccessModifier {

	public static void main(String[] args) {
		//Q.AccessModifier�� �̿��ؼ� Ŭ���� ���� ��ȣ �����ϴ� ����� �ǽ��غ���
		
		/********** PERSON **********/
		PersonDTO pDTO = new PersonDTO();
		PersonDAO pDAO = new PersonDAO();
		
		pDAO.personPrint(pDTO);

		/********** MEMBER **********/
		MemberDTO mDTO = new MemberDTO();	
		MemberDAO mDAO = new MemberDAO();
		
		mDTO.name  = "ȫ";
		mDTO.phone = "010-";

		mDAO.eat();
		
	}
	
}
