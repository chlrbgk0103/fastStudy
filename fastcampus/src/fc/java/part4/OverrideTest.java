package fc.java.part4;

public class OverrideTest {

	public static void main(String[] args) {
		// 업캐스팅
		Animal ani = new Dog();
		ani.eat();	//Amimal ===== (동적바인딩) =====> Dog
	
		ani = new Cat();
		ani.eat();
	}
	
	// Quiz 1. 상속관계에 있는 클래스를 객체생성 할 떄 하위클래스에서 상위클래스의 객체를 생성 할 때 사용하는 메서드를 쓰시오.
	// super()
	// Quiz 2. Dog클래스와 Animal클래스가 상속관계일때 Animal x = new Dog(); 처럼 객체를 생성하는 방법을 무엇이라고 하는가?
	// Upcasting [업캐스팅]
	// Quiz 3. 상속관계에서 객체가 생성될 때 맨 위 부모클래스 부터 객체가 생성되어 자식까지 연결되는 구조를 무엇이라고 하는가?
	// 상속체이닝
	// Quiz 4. 실행시점에서 사용될 메서드가 결정되는 바인딩을 무엇이라고 하는가?
	// 동적바인딩
	// Quiz 5. 상속관계에서 하위클래스가 상위클래스의 동작을 변경이나 추가하는 것을 무엇이라고 하는가?
	// Override (재정의)
	
}
