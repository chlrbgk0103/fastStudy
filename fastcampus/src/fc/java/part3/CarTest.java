package fc.java.part3;

import java.util.Scanner;

import fc.java.part3.dto.CarDTO;

public class CarTest {

	public static void main(String[] args) {
		
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
	
	// ********** Scan 출 력 ********** //
		carInfoPrint(car);
		
		
		// 자동차 데이터를 이동하기 위한 바구니가 필요핟다.(DTO, VO)
		// 클래스로 CarDTO, CarVO 모델을 설계
		
	}
	
	//Q. [매개변수로 자동차의 정보를 받아서] 출력하는 메서드를 정의하세요.ㄴ
	public static void carInfoPrint(CarDTO car) {

		System.out.println(car.carSn);
		System.out.println(car.carName);
		System.out.println(car.carPrice);
		System.out.println(car.carOwner);
		System.out.println(car.carYear);
		System.out.println(car.carType);
	}

	
}


	// Q. 자동차의 정보를 [키보드로부터 입력] 받아서 [다른 메서드]로 이동 해야 되는 경우를 생각해보자.
	
	
	// 자동차 데이터를 이동하기 위한 바구니가 필요핟다.(DTO, VO)
	// 클래스로 CarDTO, CarVO 모델을 설계





