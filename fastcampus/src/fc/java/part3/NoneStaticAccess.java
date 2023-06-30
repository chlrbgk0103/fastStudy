package fc.java.part3;

public class NoneStaticAccess {

	public int hap(int a, int b) {
	
		MyUtil noneStatichap = new MyUtil();
		int nonestatichap = a + b;
		System.out.println(noneStatichap);
	
		return nonestatichap;
		
	}
	
}
