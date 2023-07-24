package fc.java.course2.part1.model2.Book;

public class MyBookArrayTest {

	public static void main(String[] args) {
		
		// 책 3권의 데이터를 [배열]에 저장하고 출력하세요. Book[]
		BookArray list = new BookArray(); // 책 , 길이 5
		
		list.add(new BookVO("JAVA",15000,"한빛","도"));
		list.add(new BookVO("C++",15000,"한빛","쵸"));
		list.add(new BookVO("PHP",15000,"한빛","이"));
		
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
