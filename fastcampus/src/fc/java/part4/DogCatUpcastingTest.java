package fc.java.part4;

// Q. Dog와 Cat 클래스를 설계하고 동작 시켜 보세요.
public class DogCatUpcastingTest {
	
	public static void main(String[] args) {
		
		
		//Upcasting (업캐스팅) - 부모에서 자식으로
		
		//Dog 객체를 사용해보세요.
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
	}
	
}
