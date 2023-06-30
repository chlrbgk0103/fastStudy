package fc.java.part3;

import fc.java.part3.dto.Student;

public class ClassObjectInstance {

	public static void main(String[] args) {
		
		Student st1;	// st1 : Object
		Student st2;	// st2 : Object
		Student st3;	// st3 : Object
		
		st1 = new Student("홍","컴공",31,"bit0@email",202301,"010-1111"); // st1 : Instance
		st2 = new Student("길","무역",31,"bit1@email",202302,"010-2222"); // st2 : Instance
		st3 = new Student("동","연영",31,"bit2@email",202303,"010-3333"); // st3 : Instance
		
		System.out.println(st1.toString());
		System.out.println(st2);	// toString 생략 가능
		System.out.println(st3);
	}
	
}

	//Quiz1. 클래스를 사용하는 시점에서 딱한번 메모리에 로딩하기 위해서 사용하는 키워드는 무엇인가.
	// -> static
	//Quiz2. 다음은 JVM에서 사용하는 메모리 중 어떤 메모리를 설명하고 있는지 쓰세요.
	//	- 메서드가 호출되면 호출된 기계어 코드가 push되고 실행되는 메모리 공간
	//	- 현재 프로그램이 실행 되고 있는 상태를 파악할 수있다.
	//  - LIFO 구조이다.
	// -> Call Stack Frame Area
	//Quiz3. 객체생성을 막으려면 어떻게 하면 되는가?
	// -> 생성자를 private
	//Quiz4. 객체생성에 의해 메모리(Heap Memory)에 만들어진 객체를 무엇이라고 하는가?
	// -> 인스턴스
	//Quiz5. JVM이 사용하는 메모리 4가지 모델을 쓰세요.
	// -> Method, Heap, Stack, Literal POOL
