package fc.java.part4.inter;

public class InterfaceTest {

	// �������� 100% ������ �ȴ�.
	// �θ� �������̽��̸� �ڽ��� ���� ���۹���� ���� ���� ������ ��ų���� �ִ�.
	// �θ��� ������ �Ҽ��ִ�.
	// �ڱ� �ڽ��� ��ü ���� �Ұ�. 
	// ex) InterfaceRemoCon interRemo = new InterfaceRemoCon(); [ �� �� �� ]
	
	public static void main(String[] args) {
		// ���������� Radio �� TV�� ���� ���Ѻ���.
	
	
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
