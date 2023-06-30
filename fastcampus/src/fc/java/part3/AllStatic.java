package fc.java.part3;

public class AllStatic {
	
	private AllStatic(){
		
	}
	
	// 두수의 합
	public static int hap(int a, int b) {
		
		int sum = a + b;
		System.out.println("합 = " + sum);
		return sum;
	}
	
	// 최대값
	public static int max(int a, int b) {
		
		int max_1 = 0;
		a  = 12;
		b  = 3;
		
		if(a > b) {
			max_1 = a;
		} else{
			max_1 = b;
		}
		
		System.out.println("최대값 = " + max_1);
		
		return max_1;	
		
	}
	
	// 최소갑
	public static int min(int c, int d) {
		/*
		int min_1 = c > d ? d : c;
		System.out.println("최소값 = " + min_1 );
		return min_1;
		*/
		return  c > d ? d : c;
	}
	
	//최소값
	public static int min2(int e, int f) {
		
		int min_2 = Math.min(e, f);	
		return min_2;
	}
	
	
}
