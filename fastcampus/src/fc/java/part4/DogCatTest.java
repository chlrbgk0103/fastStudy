package fc.java.part4;

public class DogCatTest {

	//Dog [객체를 생성] 하고 eat() 동작을 구동해 보자
	
	
	public static void main(String[] args) {

		Dog dog = new Dog();		
		dog.eat();
		System.out.println();
		
		Cat cat = new Cat();
		cat.eat();
		cat.night();
	}
	
}
