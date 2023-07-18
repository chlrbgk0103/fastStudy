package fc.java.part4;

import fc.java.part4.dto.RempVO;

public class EmployeeTest {

	public static void main(String[] args) {
		
// 일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력을 하세요.
	
		RempVO vo = new RempVO("동",12,"020","2023","개발",true);
		
		
	/*
			RempVO vo = new RempVO();
			
			vo.name     = "홍";
			vo.age      = 60;
			vo.phone    = "010";
			vo.empDate  = "2023";
			vo.dept     = "보";
			vo.marriage = false;
			// 출력
			System.out.println(vo.name);
			System.out.println(vo.age);
			System.out.println(vo.phone);
			System.out.println(vo.name);
			System.out.println(vo.empDate);
			System.out.println(vo.dept);
			System.out.println(vo.marriage);	
			System.out.println();
	*/		
		
		System.out.println(vo);
	
	}


	// Quiz 1. 클래스를 수직적 구조로 계층화 하여 설계하는 방법을 무엇이라고 하는가.
	// -> 상속
	// Quiz 2. 자바의 상속에서 사용하는 키워드를 쓰세요.
	// -> extends
	// Quiz 3. 상속관계에 있는 클래스에서 객체생성 할때 상위클래스의 생성자를 호출하는 메서드를 쓰세요.
	// -> super()
	// Quiz 4. 상속관계에서 하위클래스가 상위클래스를 접근하기 위한 접근제한자를 쓰세요.
	// -> protected
	// Quiz 5. 클래스를 수직적 구조로(상속) 설계하면 장점이 무엇인가 쓰세요.
	// -> 1.코드중복 최소화, 2.유지보수가 쉽다. 3.확장성이 좋다.
}






