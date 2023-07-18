package fc.java.part4;

//다형성 배열

public class PolyArrayTest {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//Dog와 Cat을 저장하는 배열을 만들자?
		
		//Dog, Cat을 저장할 배열을 생성하시오.
		
		// 1번 방법 
		// Animal[] ani = (new Dog(), new Cat());
		
		// 2번 방법
		Animal[] ani = new Animal[2];
		
		ani[0] = dog;
		ani[1] = cat;
				
		display(ani);
		
	}
	
	public static void display(Animal[] ani) {	
		// 출 력
		for(int i=0;i< ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat) ani[i]).night();
			}
		}
	}
	
}
/*
	Quiz 1. 업 캐스팅으로 객체를 생성한 후 상위클래스의 타입을 하위클래스의 타입으로 바꾸는 형변환을 무엇이라고 하는가? (X)
	--> 다운바인딩(DownCasting)
	Quiz 2. 상위클래스가 동일한 메세지로 하위클래스를 서로 다르게 동작 시키는 객체지향 이론을 무엇이라고 하는가? (O)
	--> 다형성 
	Quiz 3. 다형성을 만족 할 수있는 4가지 전제조건을 쓰시오.	(O)
	--> Upcasting, 상속, 동적바인딩, 재정의(Overriding) 
	Quiz 4. 특정 타입이 어떤 타입으로 부터 생성이 되었는지 타입을 알아보는 연산자를 무엇이라고 하는가? (X)
	--> instanceof
	Quiz 5. 상속관계에서 하위클래스 들 배열에 저장하기 위해서는 어떤 배연을 생성하면 가능한가? (X)
	--> 다형성배열, 상위타입배열
*/










