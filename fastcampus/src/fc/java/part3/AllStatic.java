package fc.java.part3;

public class AllStatic {
	
	private AllStatic(){
		
	}
	
	// �μ��� ��
	public static int hap(int a, int b) {
		
		int sum = a + b;
		System.out.println("�� = " + sum);
		return sum;
	}
	
	// �ִ밪
	public static int max(int a, int b) {
		
		int max_1 = 0;
		a  = 12;
		b  = 3;
		
		if(a > b) {
			max_1 = a;
		} else{
			max_1 = b;
		}
		
		System.out.println("�ִ밪 = " + max_1);
		
		return max_1;	
		
	}
	
	// �ּҰ�
	public static int min(int c, int d) {
		/*
		int min_1 = c > d ? d : c;
		System.out.println("�ּҰ� = " + min_1 );
		return min_1;
		*/
		return  c > d ? d : c;
	}
	
	//�ּҰ�
	public static int min2(int e, int f) {
		
		int min_2 = Math.min(e, f);	
		return min_2;
	}
	
	
}
