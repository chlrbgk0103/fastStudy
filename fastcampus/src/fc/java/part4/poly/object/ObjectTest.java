package fc.java.part4.poly.object;

public class ObjectTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		System.out.println("-- -- -- -- -- -- -- -- -- --");
		
		//A ��ü�� Upcasting���� �����ϼ���.
		Object obj = new A();	// Upcasting	[Object �� java���� ���� ���̱� ������ display �޼��尡 ����.]
		((A)obj).display();  	// DownCasting
	}
	
}
