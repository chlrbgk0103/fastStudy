package fc.java.part3;

import java.util.Scanner;

import fc.java.part3.dao.CarDAO;
import fc.java.part3.dto.CarDTO;

public class CarInsertTest {
	
	public static void main(String[] args) {
		
		//Q. �ڵ��� ������ Ű����� ���� �Է��� �޾Ƽ� DB�� ������ �ϼ��� (JDBC)
		
		
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
		
		
		CarDAO dao = new CarDAO();
		dao.carInsert(car);
		dao.carSelect();
		
	}
}
