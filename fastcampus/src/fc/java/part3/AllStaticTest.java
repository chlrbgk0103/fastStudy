package fc.java.part3;

public class AllStaticTest {
	
	public static void main(String[] args) {
		
		//두수의 합
		AllStatic.hap(2, 1);
		//두수의 최대
		AllStatic.max(1, 20);
		//두수의 최소
		//AllStatic.min(2, 3);
		System.out.println("최소값 = " + AllStatic.min(2, 3));
		System.out.println("최소값Math = " + AllStatic.min2(1,2));

	}

	
	
}
