package fc.java.part4;

// Q. Dog�� Cat Ŭ������ �����ϰ� ���� ���� ������.
public class DogCatUpcastingTest {
	
	public static void main(String[] args) {
		
		
		//Upcasting (��ĳ����) - �θ𿡼� �ڽ�����
		
		//Dog ��ü�� ����غ�����.
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
	}
	
}
