package fc.java.part4.poly.object;

public class ObjectTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		System.out.println("-- -- -- -- -- -- -- -- -- --");
		
		//A 객체를 Upcasting으로 생성하세요.
		Object obj = new A();	// Upcasting	[Object 는 java에서 만든 것이기 때문에 display 메서드가 없다.]
		((A)obj).display();  	// DownCasting
	}
	
}
