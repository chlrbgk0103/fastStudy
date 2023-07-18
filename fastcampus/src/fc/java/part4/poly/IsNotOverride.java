package fc.java.part4.poly;

public class IsNotOverride {
	
	// [다형성을 보장하지 않은 상태]
	public static void main(String[] args) {
		// 재정의를 안했기 때문에 -> 부모가 명령을 내리면(메세지를 보내면) 오작동을 한다.
		// 해결방법 -> (재정의를 강제로 하도록 만들어 주면 된다.)	[추상클래스, 인터페이스]
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
	}
	
	
	
}
