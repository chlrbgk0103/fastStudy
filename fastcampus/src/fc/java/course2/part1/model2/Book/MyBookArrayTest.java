package fc.java.course2.part1.model2.Book;

public class MyBookArrayTest {

	public static void main(String[] args) {
		
		// å 3���� �����͸� [�迭]�� �����ϰ� ����ϼ���. Book[]
		BookArray list = new BookArray(); // å , ���� 5
		
		list.add(new BookVO("JAVA",15000,"�Ѻ�","��"));
		list.add(new BookVO("C++",15000,"�Ѻ�","��"));
		list.add(new BookVO("PHP",15000,"�Ѻ�","��"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		
		/*	
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
	}
	
}
