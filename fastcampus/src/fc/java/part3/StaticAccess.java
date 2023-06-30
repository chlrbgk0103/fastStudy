package fc.java.part3;

public class StaticAccess {
	
	public static void main(String[] args) {
		
		int a =20;
		int b =10;
		
		int a1 =230;
		int b1 =140;
		
		// MyUtil
		
		
			// 기울어진 Method 는 다 Static 메소드 ( ex. MyUtil.hap 에서 [ hap ])
			//[Static 붙붙은 경우]
			int sumA =  MyUtil.statichap(a1, b1);
			System.out.println(sumA);
		
			System.out.println("------------------");
		
		
			//[Staitc안 붙은 경우]		
			MyUtil util = new MyUtil();
			int sumB = util.nonestatichap(a, b);
			System.out.println(sumB);
		
	}
	
}
/*
 * 	[Method Area]
 * 	[Heap Area], 우리가 생성하기 때문에 용량이 계속 쌓일 수 있으므로 가비지컬렉터가 주기적으로 삭제(제너레이션)
 *  [Stack Area]
 */