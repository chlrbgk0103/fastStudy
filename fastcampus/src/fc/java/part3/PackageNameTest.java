package fc.java.part3;

import java.util.*; // default

import fc.java.part3.dao.CarDAO;
import fc.java.part3.dto.*;

public class PackageNameTest {

	public static void main(String[] args) {
		//Q.지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자.
		
		String str = "홍길동";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello Wowrld");
		
		//Q. 우리가 직접 만들어서 사용해 본 클래스의 이름을 적어보자.
		CarDTO carDTO = new CarDTO();
		CarDAO carDAO = new CarDAO();

	}
	
}
