package fc.java.course2.part1.model2;

import java.util.ArrayList;
import java.util.List;

import fc.java.course2.part1.model2.Book.BookVO;

public class ArrayListTest {

	public static void main(String[] args) {
		// Book 3���� �迭�� �����ϰ� ����ϼ���.
		// Book[], Object[]
		
		//ArrayList = ObjectArray �� ����
		List list = new ArrayList();
		
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
		
	}
	
}
















