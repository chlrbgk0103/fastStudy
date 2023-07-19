package fc.java.part4.poly.object;

public class ObjectPolyArray {

	public static void main(String[] args) {
		
		// A, B 클래스를 저장할 배열을 생성하세요.
		
		Object obj[] = new Object[2];
		obj[0] = new A(); 	//Upcasting
		((A)obj[0]).printGo();
		
		obj[1] = new B(); 	//Upcasting
		((B)obj[1]).printGo();

		
		
		System.out.println("-- - -- -- -- -- -- -- -- --");
		// 반복문
			/*
				for(int i=0;i<obj.length;i++) {
					if (obj[i] instanceof A) {
						((A)obj[i]).printGo();
					}else {
						((B)obj[i]).printGo();
					}
				}
			*/
		
		//메서드
		display(obj);
	}
	private static void display(Object[] obj) {
		for(int i=0;i<obj.length;i++) {
			if (obj[i] instanceof A) {
				((A)obj[i]).printGo();
			}else {
				((B)obj[i]).printGo();
			}
		}
	}
	
}
