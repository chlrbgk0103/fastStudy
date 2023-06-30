package fc.java.part3;

import java.util.Scanner;

import fc.java.part3.dto.CarDTO;

public class CarTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("�ڵ��� �Ϸù�ȣ : ");
		int carSn = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("�ڵ��� �̸� : ");
		String carName = scan.nextLine();

		scan.nextLine();
		
		System.out.print("�ڵ��� ���� : ");
		int carPrice = scan.nextInt();
	
		scan.nextLine();
		
		System.out.print("�ڵ��� ������ : ");
		String carOwner = scan.nextLine();
		
		scan.nextLine();
		
		System.out.print("�ڵ��� ��� : ");
		int carYear = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("�ڵ��� Ÿ�� : ");	 // G(�ֹ���), D(����)
		String carType = scan.nextLine();
		
	// ********** Car ���� ********** //
		CarDTO car = new CarDTO();		

		car.carSn = carSn;
		car.carName = carName;
		car.carPrice = carPrice;
		car.carOwner = carOwner;
		car.carYear = carYear;
		car.carType = carType;
	
	// ********** Scan �� �� ********** //
		carInfoPrint(car);
		
		
		// �ڵ��� �����͸� �̵��ϱ� ���� �ٱ��ϰ� �ʿ�����.(DTO, VO)
		// Ŭ������ CarDTO, CarVO ���� ����
		
	}
	
	//Q. [�Ű������� �ڵ����� ������ �޾Ƽ�] ����ϴ� �޼��带 �����ϼ���.��
	public static void carInfoPrint(CarDTO car) {

		System.out.println(car.carSn);
		System.out.println(car.carName);
		System.out.println(car.carPrice);
		System.out.println(car.carOwner);
		System.out.println(car.carYear);
		System.out.println(car.carType);
	}

	
}


	// Q. �ڵ����� ������ [Ű����κ��� �Է�] �޾Ƽ� [�ٸ� �޼���]�� �̵� �ؾ� �Ǵ� ��츦 �����غ���.
	
	
	// �ڵ��� �����͸� �̵��ϱ� ���� �ٱ��ϰ� �ʿ�����.(DTO, VO)
	// Ŭ������ CarDTO, CarVO ���� ����





