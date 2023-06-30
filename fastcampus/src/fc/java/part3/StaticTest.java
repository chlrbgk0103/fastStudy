package fc.java.part3;

public class StaticTest {
	
	public static void main(String[] args) {
		
		hap(4,3);
		
	}
	
	//Q. 매개변수로 2개의 정수를 입력받아 총합을 구해 리턴하는 메서드를 정의 하시오.
	public static int hap(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
		
	}


}
