package fc.java.part4.poly;

public class AbstractClassTest {

	// -- �߻�Ŭ������ ??
	// 1. �������� �Ϻ� �����ϱ� ���ؼ� ����
	// 2. ���� ����� Ŭ������ ����κ��� ���� �� ���
	// 3. �ܵ����� ��ü�� ���� �� ������.
	// ex) Animal ani = new Animal() [���� �Ұ���]
	// 4. �θ��� ���ҷ� ����Ѵ�. (Upcasting)
	// ex) Animal ani = new Dog();
	// 	   ani.eat();
	// 5. ������ �޼��带 ���� �� �ִ�. (move)
	
	
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani = new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night();
	}
	
	
}
