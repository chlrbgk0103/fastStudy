package fc.java.part3.dao;

import fc.java.part3.dto.PersonDTO;

public class PersonDAO {

	public void personPrint(PersonDTO person) {
		
		person.name  = "이름";
		person.age   = 111;
		person.phone = "010-1111";
		
		System.out.println("이름 : " + person.name);
		System.out.println("나이 : " + person.age);
		System.out.println("전화번호 : " + person.phone);
		
	}
	
	/***** 행위정보 *****/
	public void play() {
		System.out.println("운동");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
	
	public void walk() {
		System.out.println("걷다");
	}

	
}
