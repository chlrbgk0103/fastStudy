package fc.java.part3.dao;

import fc.java.part3.dto.PersonDTO;

public class PersonDAO {

	public void personPrint(PersonDTO person) {
		
		person.name  = "�̸�";
		person.age   = 111;
		person.phone = "010-1111";
		
		System.out.println("�̸� : " + person.name);
		System.out.println("���� : " + person.age);
		System.out.println("��ȭ��ȣ : " + person.phone);
		
	}
	
	/***** �������� *****/
	public void play() {
		System.out.println("�");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}
	
	public void walk() {
		System.out.println("�ȴ�");
	}

	
}
