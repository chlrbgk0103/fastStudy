package fc.java.part4;

public class PolyTest {

	public static void main(String[] args) {

		// Upcasting���� ��ü�� ���� -> �θ� �ڽĿ��� ���
		// �������� [ ��Ӱ���, ������(Override), �������ε�, Upcasting ] 
		// ������(message polymorephism)
		// ����Ŭ������ ������ �޼����� ����Ŭ������ ���δٸ��� ���۽�Ű�� ��ü���� ����
		
		Animal ani = new Dog();
		ani.eat();		// ����������� ����[ȣ���] �޼��尡 �����Ǵ� ���ε� -> (�������ε�)
		
		ani = new Cat();
		ani.eat();
		
		// Cat�� night �޼��带 �����Ϸ��� DownCasting�� ����ؾ� �Ѵ�.
		((Cat)ani).night();
		
		// Overloading(�����ε�) : �������ε� = ������ �������� ���� �޼��尡 �����Ǵ� ���ε�
		// -> ���α׷��� ����ӵ��� ����
		// Override(������) : �������ε� = ����������� ����(ȣ���) �޼���� �����Ǵ� ���ε�
		// -> ���α׷��� ����ӵ��� ���谡 �ִ�.
		
	}

}
