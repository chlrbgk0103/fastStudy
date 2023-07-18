package fc.java.part4;

public class PolyTest {

	public static void main(String[] args) {

		// Upcasting으로 객체를 생성 -> 부모가 자식에게 명령
		// 전제조건 [ 상속관계, 재정의(Override), 동적바인딩, Upcasting ] 
		// 다형성(message polymorephism)
		// 상위클래스가 동일한 메세지로 하위클래스를 서로다르게 동작시키는 객체지향 원리
		
		Animal ani = new Dog();
		ani.eat();		// 실행시점에서 사용될[호출될] 메서드가 결정되는 바인딩 -> (동적바인딩)
		
		ani = new Cat();
		ani.eat();
		
		// Cat의 night 메서드를 실행하려면 DownCasting을 사용해야 한다.
		((Cat)ani).night();
		
		// Overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
		// -> 프로그램의 실행속도와 무관
		// Override(재정의) : 동적바인딩 = 실행시점에서 사용될(호출될) 메서드라 결정되는 바인딩
		// -> 프로그램의 실행속도와 관계가 있다.
		
	}

}
