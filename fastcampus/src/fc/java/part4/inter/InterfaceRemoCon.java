package fc.java.part4.inter;

public interface InterfaceRemoCon {
	
	/*
	public int MAXCH = 99;
	public int MINCH = 1;
	*/
	
	/* ���� �ΰ��� ����� ���� ǥ�� */
	public static final int MAXCH = 99;
	public static final int MINCH = 1;
	
	public abstract void chUp();
	public abstract void chDown();
	public abstract void volUp();
	public abstract void volDown();

	
// interface ��� �� ���� ���� �޼ҵ�� ��� �Ұ�
	
/*	
	public void internet() {
		System.out.println("���ͳ��� �����ȴ�.");
	}
*/	
	
// internet �߻�޼���� ��ȯ
		public abstract void internet();
	
}
