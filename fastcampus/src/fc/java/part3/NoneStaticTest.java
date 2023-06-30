package fc.java.part3;

public class NoneStaticTest {
	
	public static void main(String[] args) {
		
		// 생성자생성 을 이용해 static 없어도 되게 한다.		
		NoneStaticTest noneStatic = new NoneStaticTest();
		
		int sum = noneStatic.hap(2, 3);
		
		System.out.println(sum);
	}
	
	//static (x) 메소드 [생성자생성 을 이용해 static 없어도 되게 한다.]
	//[생성자생성 을 이용해 static 없어도 되게 한다.] -> Heap Memory 안에
	public int hap(int a, int b) {
		int v = a+b;
		return v;
	}
	
}
