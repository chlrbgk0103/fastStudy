package fc.java.part4.inter;

public class Radio implements InterfaceRemoCon{

	@Override
	public void chUp() {
		System.out.println("���� ä���� �ö󰣴�.");		
	}

	@Override
	public void chDown() {
		System.out.println("���� ä���� ��������.");		
	}

	@Override
	public void volUp() {
		System.out.println("���� �Ҹ��� �ö󰣴�.");		
	}

	@Override
	public void volDown() {
		System.out.println("���� �Ҹ��� ��������. ");		
		
	}
	
	@Override
	public void internet() {
		System.out.println("���� ������ ���ͳ� ������ �ȵ˴ϴ�.");
	}
	
}
