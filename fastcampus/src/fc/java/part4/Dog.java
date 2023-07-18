package fc.java.part4;

public class Dog extends Animal{

	public Dog() {
		super();
	}
	
	public void eat() {
		System.out.println("개처럼 먹다.");
	}

	
	//상속체이닝(나보다 부모가 먼저)
	//맨 위 부모클래스 부터 객체가 생성되어 자식까지 연결되는 구조
	
	//super()
	//상위 클래스의 생성자를 호출하는 메서드
	//생성자메서드에서 가장 첫 문장에 사용해야 한다.
	//상위 클래스의 기본생성자를 호출하는 super() 는 생략되어 있다.
	
}
