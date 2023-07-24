package fc.java.course2.part1.model2;

import java.util.*;

import fc.java.course2.part1.model2.Book.BookVO;


//Quiz 1. �ڹٿ��� �������ִ� Ŭ���� �� ��� ��ü�� �迭�� �����Ͽ� �����ϴ� Ŭ������ �����ΰ�? [O]
// -> ArrayList 
//Quiz 2. ArrayList�� ����� �ڹ� ��Ű�� �̸��� ������. [X]
// -> java.util 
//Quiz 3. ArrayList �� ��ü�� �����ϴ� �޼��� �̸��� ��ü�� �������� �޼��� �̸��� ������. [O]
// -> add, get
//Quiz 4. ArrayList �� ����� ��ü�� ������ ���ϴ� �޼��带 ������. [O]
// -> size
//Quiz 5. ArrayList �� Book Ÿ���� ��ü�� �����ҷ��� ��� ������ �ؾ��ϴ°� [X]
// -> ArrayList<Book>

public class ArrayListBestTest {


	public static void main(String[] args) {
		// Book 3���� �迭�� �����ϰ� ����ϼ���.
		// Book[], Object[]
		
		//ArrayList = ObjectArray �� ����
		List<BookVO> list = new ArrayList<BookVO>();
		
		list.add(new BookVO("JAVA",15000,"�Ѻ�","��"));
		list.add(new BookVO("C++",15000,"�Ѻ�","��"));
		list.add(new BookVO("PHP",15000,"�Ѻ�","��"));
		
System.out.println("-- -- -- -- -- -- -- -- -- --");
	
		BookVO vo = (BookVO)list.get(0); // BookVO = (BookVO)Object �ٿ�ĳ���� �ؾ���
		System.out.println(vo.toString());

		vo = (BookVO)list.get(1); // BookVO = (BookVO)Object �ٿ�ĳ���� �ؾ���
		System.out.println(vo.toString());

		vo = (BookVO)list.get(2); // BookVO = (BookVO)Object �ٿ�ĳ���� �ؾ���
		System.out.println(vo.toString());
		
System.out.println("-- -- -- -- -- -- -- -- -- --");

		for(int i=0; i<list.size();i++) {
			System.out.println(((BookVO)list.get(i)));
		}
		
System.out.println("-- -- -- -- -- -- -- -- -- --");
		
		for(int i=0; i<list.size();i++) {
			// Object -> BookVO(JVM ���� �ڵ����� BookVodml toString())
			System.out.println(list.get(i));	//������ �� ����Ŭ���� �̹Ƿ� �����ϰ� ���� ����.
		}
		
System.out.println("-- -- -- -- -- -- -- -- -- --");
		
		//���׸��� ����ϰ� �Ǹ� �ٿ�ĳ������ �� �ʿ䰡 ����.

		vo = list.get(0); // BookVO = (BookVO)Object �ٿ�ĳ���� �ؾ���
		System.out.println(vo.toString());
		
		vo = list.get(1); // BookVO = (BookVO)Object �ٿ�ĳ���� �ؾ���
		System.out.println(vo.toString());

		vo = list.get(2); // BookVO = (BookVO)Object �ٿ�ĳ���� �ؾ���
		System.out.println(vo.toString());		
		
		
	}
	
}
