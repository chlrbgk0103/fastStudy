package fc.java.part4.inter;

public class TV implements InterfaceRemoCon{

	private int currcUp   = 99;	// ���� 98 �� ä��
	private int currcDown = 1;	// ���� 1 �� ä��
	
	//chUp(), chDown(), volUp(), volDown()
	
	@Override
	public void chUp() {
	    currcUp++;	// [test] Up��ư�� Ŭ���� ��
		if(currcUp > InterfaceRemoCon.MAXCH) {
			// MAXCH �� 99 �̹Ƿ� 99�̻� �Ͻ� �ٽ� ä�� 1 ��
			currcUp = 1;
		}
		System.out.println("TV ä���� �ö󰣴�.");	
		System.out.println("ä �� : " + currcUp);
	}

	@Override
	public void chDown() {
	    currcDown--; // [test] Down��ư�� Ŭ���� ��	
		if(currcDown < InterfaceRemoCon.MINCH) {
			// MINCH �� 1 �̹Ƿ� 1���� �Ͻ� �ٽ� ä�� 99 ��
			currcDown = 99;
		}	
		System.out.println("TV ä���� ��������.");	
		System.out.println("ä �� : " + currcDown);
		
	}

	@Override
	public void volUp() {
		System.out.println("TV �Ҹ��� �ö󰣴�.");		
	}

	@Override
	public void volDown() {
		System.out.println("TV �Ҹ��� ��������. ");		
		
	}
	
	@Override
	public void internet() {
		System.out.println("TV ������ ���ͳ� ������ �˴ϴ�.");
	}
	
}

	// Quiz 1. ���� ����� Ŭ������ ����κ��� ���� �� ����ϴ� Ŭ������ �����̶�� �ϴ°� ? [X]
	// -> �߻�Ŭ���� 
	// Quiz 2. ���� �ٸ� Ŭ������ ����κ��� ������ ����ϴ� Ŭ������ �����̶�� �ϴ°�? [X]
	// -> �������̽�
	// Quiz 3. �������̽��� ���� ���ִ� ��� 2������ ������. [X]
	// -> �߻�޼���, final static ���
	// Quiz 4. �������� �����ϱ� ���ؼ� ����� Ŭ���� 2������ ������. [X]
	// -> �������̽�, �߻�Ŭ����
	// Quiz 5. DogŬ������ AnimalŬ������ ��ӹް� Pet �������̽��� �����ߴٿ� ���� �ڵ带 �ۼ��Ͻÿ�. [O]
	/*
	 *  public class Dog extends Animal implements Pet{
	 *	
	 *	}
	 *
	 */





