// Q1.영화, 사람, 책 이런 자료형을 어떤 자료형이라고 하는가?
// -> 사용자 정의 자료형 or 객체 자료형
// Q2.클래스란 무엇인지 쓰세요.
// -> 새로운 자료형을 만드는 도구
// Q3.객체를 메모리에 올리는 과정을 무엇이라고 하는가?
// -> 객체생성
// Q4.객체를 구성하고 있는 2가지 정보를 쓰세요
// -> 상태정보, 행위정보
// Q5.객체 생성하는 역할을 가지고 있는 메서드를 무엇이라고 하는가?
// -> 생성자 메서드
// Q6.객체가 생성된 후 자기 자신을 가리키는 레퍼런스 변수는 무엇인가?
// -> this
// Q7.힙(Heap Memory)에 만들어진 객체를 무엇이라고 하는가(객체의 실체를 부르는 말)?
// -> 인스턴스

package fc.java.part3;

import fc.java.part3.dto.PersonDTO;

public class Person {

	//Q.이름, 나이, 전화번호 상태정보와 운동,먹다,걷다 헹위정보를 가지고 있는 Person 클래스를 모델링 하세요.
	
	public static void main(String[] args) {
		
		PersonDTO personDTO = new PersonDTO();
		// personDTO -- > 객체(인스턴스 변수)
		// 그냥 PersonDTO personDTO 의 personDTO 은 객체(변수) 인스턴스 변수 x
		// new연산자 (생성자)메서드()
		
		personDTO.phone = "010";
		personDTO.name  = "쵸이";
		personDTO.age   = 1;
		
		PersonDTO.play();
		PersonDTO.eat();
		PersonDTO.walk();

		System.out.println("person : " + " [ 이름 ] : " + personDTO.name + " [ 나이 ] : " + personDTO.age + " [ 전화번호 ] : " + personDTO.phone );
		

	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
}
