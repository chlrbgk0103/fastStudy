package fc.java.course2.part1.model2;

import java.util.ArrayList;
import java.util.List;

import fc.java.course2.part1.model2.Book.BookVO;

public class ArrayListTest {

	public static void main(String[] args) {
		// Book 3권을 배열에 저장하고 출력하세요.
		// Book[], Object[]
		
		//ArrayList = ObjectArray 와 유사
		List list = new ArrayList();
		
		list.add(new BookVO("JAVA",15000,"한빛","도"));
		list.add(new BookVO("C++",15000,"한빛","쵸"));
		list.add(new BookVO("PHP",15000,"한빛","이"));
		
System.out.println("-- -- -- -- -- -- -- -- -- --");
	
		BookVO vo = (BookVO)list.get(0); // BookVO = (BookVO)Object 다운캐스팅 해야함
		System.out.println(vo.toString());

		vo = (BookVO)list.get(1); // BookVO = (BookVO)Object 다운캐스팅 해야함
		System.out.println(vo.toString());

		vo = (BookVO)list.get(2); // BookVO = (BookVO)Object 다운캐스팅 해야함
		System.out.println(vo.toString());
		
System.out.println("-- -- -- -- -- -- -- -- -- --");

		for(int i=0; i<list.size();i++) {
			System.out.println(((BookVO)list.get(i)));
		}
		
System.out.println("-- -- -- -- -- -- -- -- -- --");
		
		for(int i=0; i<list.size();i++) {
			// Object -> BookVO(JVM 에서 자동으로 BookVodml toString())
			System.out.println(list.get(i));	//재정의 된 하위클래스 이므로 동일하게 답이 나옴.
		}
		
	}
	
}
















