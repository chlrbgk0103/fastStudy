package fc.java.part4.inter;

// �߻�Ŭ���� = �߻�޼��� + �����޼���

public abstract class RemoCon {

	//chUp(), chDown(), volUp(), volDown()

	public abstract void chUp();
	public abstract void chDown();
	public abstract void volUp();
	public abstract void volDown();

	public void internet() {
		System.out.println("���ͳ��� �����ȴ�.");
	}
	
}
