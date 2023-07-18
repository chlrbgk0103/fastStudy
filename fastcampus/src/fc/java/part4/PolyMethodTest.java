package fc.java.part4;


// 다형성 인수

public class PolyMethodTest {
	
	
	
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		display(dog);
		
		Cat cat = new Cat();
		display(cat);
		
	}
/*	
	public static void display(Dog dog) {
		dog.eat();
	};
	
	public static void display(Cat cat) {
		cat.eat();
	};
*/
	
	private static void display(Animal ani) {	// 다형성 인수
		
		ani.eat();
		if(ani instanceof Cat) {			
			((Cat)ani).night();
		}
	
	}
	
}
