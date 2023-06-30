package fc.java.part3;

import java.util.Scanner;

import fc.java.part3.dao.CarDAO;
import fc.java.part3.dto.CarDTO;

public class CarInsertTest {
	
	public static void main(String[] args) {
		
		//Q. 자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장을 하세요 (JDBC)
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자동차 일련번호 : ");
		int carSn = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("자동차 이름 : ");
		String carName = scan.nextLine();
	
		scan.nextLine();
		
		System.out.print("자동차 가격 : ");
		int carPrice = scan.nextInt();
	
		scan.nextLine();
		
		System.out.print("자동차 소유자 : ");
		String carOwner = scan.nextLine();
		
		scan.nextLine();
		
		System.out.print("자동차 년식 : ");
		int carYear = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("자동차 타입 : ");	 // G(휘발유), D(경유)
		String carType = scan.nextLine();
			
		// ********** Car 정보 ********** //
		CarDTO car = new CarDTO();		

		car.carSn = carSn;
		car.carName = carName;
		car.carPrice = carPrice;
		car.carOwner = carOwner;
		car.carYear = carYear;
		car.carType = carType;
		
		
		CarDAO dao = new CarDAO();
		dao.carInsert(car);
		dao.carSelect();
		
	}
}
