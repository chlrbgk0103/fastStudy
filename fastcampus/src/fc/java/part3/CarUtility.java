package fc.java.part3;

import fc.java.part3.dto.CarDTO;

public class CarUtility {
	
	//�Ű������� �ڵ����� ������ �Է¹޾Ƽ� ����ϴ� �޼��带 �����ϼ���.
	public static void carPrint(CarDTO car) {
		
		/********** ���� (�� ����) **********/
		 int carSn 		 = 100;
		 String carName	 = "���̸�";
		 int carPrice	 = 100000;
		 String carOwner = "������";
		 int carYear	 = 2023;
		 String carType  = "�ֹ���";	
		 
		 car.carSn = carSn;
		 car.carName = carName;
		 car.carPrice = carPrice;
		 car.carOwner = carOwner;
		 car.carYear = carYear;
		 car.carType = carType;
	
		/*********** �� ��� **********/
		 System.out.println(car.carSn);
		 System.out.println(car.carName);
		 System.out.println(car.carPrice);
		 System.out.println(car.carOwner);
		 System.out.println(car.carYear);
		 System.out.println(car.carType);
		 		 
	}
	
}
