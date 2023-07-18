package fc.java.part4.inter;

public class InterfaceTest {

	// 다형성이 100% 보장이 된다.
	// 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
	// 부모의 역할을 할수있다.
	// 자기 자신의 객체 생성 불가. 
	// ex) InterfaceRemoCon interRemo = new InterfaceRemoCon(); [ 불 가 능 ]
	
	public static void main(String[] args) {
		// 리모콘으로 Radio 와 TV를 동작 시켜보자.
	
	
		InterfaceRemoCon interRemo = new Radio();
	/*	
		interRemo.chUp();
		interRemo.chDown();	
		interRemo.volUp();
		interRemo.volDown();
		interRemo.internet();
	*/	
		
System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");		

		interRemo = new TV();
		
		interRemo.chUp();
		interRemo.chDown();
	/*	
		interRemo.volUp();
		interRemo.volDown();
		interRemo.internet();
	 */
	}
	
}
