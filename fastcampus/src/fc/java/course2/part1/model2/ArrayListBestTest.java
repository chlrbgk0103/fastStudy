package fc.java.course2.part1.model2;

import java.util.*;

import fc.java.course2.part1.model2.Book.BookVO;


//Quiz 1. 자바에서 제공해주는 클래스 중 모든 객체를 배열에 저장하여 관리하는 클래스는 무엇인가? [O]
// -> ArrayList 
//Quiz 2. ArrayList가 저장된 자바 패키지 이름을 쓰세요. [X]
// -> java.util 
//Quiz 3. ArrayList 에 객체를 저장하는 메서드 이름과 객체를 가져오는 메서드 이름을 쓰세요. [O]
// -> add, get
//Quiz 4. ArrayList 에 저장된 객체의 개수를 구하는 메서드를 쓰세요. [O]
// -> size
//Quiz 5. ArrayList 에 Book 타입의 객체만 저장할려면 어떻게 선언을 해야하는가 [X]
// -> ArrayList<Book>

public class ArrayListBestTest {


	public static void main(String[] args) {
		// Book 3권을 배열에 저장하고 출력하세요.
		// Book[], Object[]
		
		//ArrayList = ObjectArray 와 유사
		List<BookVO> list = new ArrayList<BookVO>();
		
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
		
System.out.println("-- -- -- -- -- -- -- -- -- --");
		
		//제네릭을 사용하게 되면 다운캐스팅을 할 필요가 없다.

		vo = list.get(0); // BookVO = (BookVO)Object 다운캐스팅 해야함
		System.out.println(vo.toString());
		
		vo = list.get(1); // BookVO = (BookVO)Object 다운캐스팅 해야함
		System.out.println(vo.toString());

		vo = list.get(2); // BookVO = (BookVO)Object 다운캐스팅 해야함
		System.out.println(vo.toString());		
		
		
	}
	
}
