package fc.java.part4.poly;

public class IsNotOverride {
	
	// [�������� �������� ���� ����]
	public static void main(String[] args) {
		// �����Ǹ� ���߱� ������ -> �θ� ����� ������(�޼����� ������) ���۵��� �Ѵ�.
		// �ذ��� -> (�����Ǹ� ������ �ϵ��� ����� �ָ� �ȴ�.)	[�߻�Ŭ����, �������̽�]
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
	}
	
	
	
}
