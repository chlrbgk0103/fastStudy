package fc.java.part3;

import fc.java.part3.dto.CarDTO;

public class CarUtility {
	
	//매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요.
	public static void carPrint(CarDTO car) {
		
		/********** 변수 (값 포함) **********/
		 int carSn 		 = 100;
		 String carName	 = "차이름";
		 int carPrice	 = 100000;
		 String carOwner = "소유자";
		 int carYear	 = 2023;
		 String carType  = "휘발유";	
		 
		 car.carSn = carSn;
		 car.carName = carName;
		 car.carPrice = carPrice;
		 car.carOwner = carOwner;
		 car.carYear = carYear;
		 car.carType = carType;
	
		/*********** 값 출력 **********/
		 System.out.println(car.carSn);
		 System.out.println(car.carName);
		 System.out.println(car.carPrice);
		 System.out.println(car.carOwner);
		 System.out.println(car.carYear);
		 System.out.println(car.carType);
		 		 
	}
	
}
