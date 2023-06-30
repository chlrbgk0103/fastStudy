package fc.java.part3.dto;

// Object = 상태정보(멤버변수) + 헹위정보(멤버메서드)

//생성자 메서드//
public class PersonDTO {

// Q.한 사람의 데이터를 저장할 [변수를 선언]하세요.	
	
	/***** 상태정보 *****/
	public String name;		// 이름
	public int age;			// 나이
	public String phone;	// 전화번호
	
	// 기본 생성자메서드 (default 생성자)
	public PersonDTO() {
		//객체를 생성하는 코드 생략
	}

	/***** 행위정보 *****/
	public static void play() {
		System.out.println("운동");
	}
	
	public static void eat() {
		System.out.println("먹다");
	}
	
	public static void walk() {
		System.out.println("걷다");
	}

}