package fc.java.part3;

public class StaticAccess {
	
	public static void main(String[] args) {
		
		int a =20;
		int b =10;
		
		int a1 =230;
		int b1 =140;
		
		// MyUtil
		
		
			// ������ Method �� �� Static �޼ҵ� ( ex. MyUtil.hap ���� [ hap ])
			//[Static �ٺ��� ���]
			int sumA =  MyUtil.statichap(a1, b1);
			System.out.println(sumA);
		
			System.out.println("------------------");
		
		
			//[Staitc�� ���� ���]		
			MyUtil util = new MyUtil();
			int sumB = util.nonestatichap(a, b);
			System.out.println(sumB);
		
	}
	
}
/*
 * 	[Method Area]
 * 	[Heap Area], �츮�� �����ϱ� ������ �뷮�� ��� ���� �� �����Ƿ� �������÷��Ͱ� �ֱ������� ����(���ʷ��̼�)
 *  [Stack Area]
 */