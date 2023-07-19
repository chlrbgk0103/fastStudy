package fc.java.part4.poly.object;

public class ObjectPolyArray {

	public static void main(String[] args) {
		
		// A, B Ŭ������ ������ �迭�� �����ϼ���.
		
		Object obj[] = new Object[2];
		obj[0] = new A(); 	//Upcasting
		((A)obj[0]).printGo();
		
		obj[1] = new B(); 	//Upcasting
		((B)obj[1]).printGo();

		
		
		System.out.println("-- - -- -- -- -- -- -- -- --");
		// �ݺ���
			/*
				for(int i=0;i<obj.length;i++) {
					if (obj[i] instanceof A) {
						((A)obj[i]).printGo();
					}else {
						((B)obj[i]).printGo();
					}
				}
			*/
		
		//�޼���
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
