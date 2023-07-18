package fc.java.part4.poly;

public class AbstractClassTest {

	// -- 추상클래스란 ??
	// 1. 다형성을 일부 보장하기 위해서 등장
	// 2. 서로 비슷한 클래스의 공통부분을 묶을 때 사용
	// 3. 단독으로 객체를 생성 할 수없다.
	// ex) Animal ani = new Animal() [생성 불가능]
	// 4. 부모의 역할로 사용한다. (Upcasting)
	// ex) Animal ani = new Dog();
	// 	   ani.eat();
	// 5. 구현된 메서드를 가질 수 있다. (move)
	
	
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani = new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night();
	}
	
	
}
