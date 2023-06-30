package fc.java.part3;

import fc.java.part3.dto.BookDTO;

//Quiz 1. 자바에서 객체를 접근 할 때 사용하는 접근제한자(Acess ModiFier) 4개를 쓰세요.
//-> private, product, default, public
//Quiz 2. 자바에서 서로기능이 비슷한 클래스들끼리 모아서 관리를 쉽게 하기 위해 사용하는 것은 무엇인가
//-> package
//Quiz 3. 자바에서 제공해주는 패기지 중 default package를 쓰세요.
//-> java.lang
//Quiz 4. 클래스를 접근하는 방법 2가지를 기술하세요.
//-> 클래스 전체이름으로 접근, import를 사용하여 접근
//Quiz 5. 자베에서 제공해주는 API 중에서 String클래스의 Full Name을 쓰세요.
//-> java.lang.String
//Quiz 6. 패키지를 현재 클래스에 포함시킬 때 사용하는 명령어를 쓰세요.
//-> import

public class MyClass {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		BookDTO dto = new BookDTO();
	}

}
