package fc.java.part4;

//������ �迭

public class PolyArrayTest {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//Dog�� Cat�� �����ϴ� �迭�� ������?
		
		//Dog, Cat�� ������ �迭�� �����Ͻÿ�.
		
		// 1�� ��� 
		// Animal[] ani = (new Dog(), new Cat());
		
		// 2�� ���
		Animal[] ani = new Animal[2];
		
		ani[0] = dog;
		ani[1] = cat;
				
		display(ani);
		
	}
	
	public static void display(Animal[] ani) {	
		// �� ��
		for(int i=0;i< ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat) ani[i]).night();
			}
		}
	}
	
}
/*
	Quiz 1. �� ĳ�������� ��ü�� ������ �� ����Ŭ������ Ÿ���� ����Ŭ������ Ÿ������ �ٲٴ� ����ȯ�� �����̶�� �ϴ°�? (X)
	--> �ٿ���ε�(DownCasting)
	Quiz 2. ����Ŭ������ ������ �޼����� ����Ŭ������ ���� �ٸ��� ���� ��Ű�� ��ü���� �̷��� �����̶�� �ϴ°�? (O)
	--> ������ 
	Quiz 3. �������� ���� �� ���ִ� 4���� ���������� ���ÿ�.	(O)
	--> Upcasting, ���, �������ε�, ������(Overriding) 
	Quiz 4. Ư�� Ÿ���� � Ÿ������ ���� ������ �Ǿ����� Ÿ���� �˾ƺ��� �����ڸ� �����̶�� �ϴ°�? (X)
	--> instanceof
	Quiz 5. ��Ӱ��迡�� ����Ŭ���� �� �迭�� �����ϱ� ���ؼ��� � �迬�� �����ϸ� �����Ѱ�? (X)
	--> �������迭, ����Ÿ�Թ迭
*/










