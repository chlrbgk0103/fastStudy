package fc.java.part3;

public class NoneStaticTest {
	
	public static void main(String[] args) {
		
		// �����ڻ��� �� �̿��� static ��� �ǰ� �Ѵ�.		
		NoneStaticTest noneStatic = new NoneStaticTest();
		
		int sum = noneStatic.hap(2, 3);
		
		System.out.println(sum);
	}
	
	//static (x) �޼ҵ� [�����ڻ��� �� �̿��� static ��� �ǰ� �Ѵ�.]
	//[�����ڻ��� �� �̿��� static ��� �ǰ� �Ѵ�.] -> Heap Memory �ȿ�
	public int hap(int a, int b) {
		int v = a+b;
		return v;
	}
	
}
