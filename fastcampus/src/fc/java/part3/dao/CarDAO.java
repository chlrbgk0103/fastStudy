package fc.java.part3.dao;

import fc.java.part3.dto.CarDTO;

// DAO (Data Access Object)
// CRUD ������ �������ִ� Ŭ����, ����Ͻ� ������ ó���ϴ� Ŭ����
public class CarDAO {
	// C R U D
	
	// Create = insert��
	public void carInsert(CarDTO car) {
		System.out.println("CAR ������ DB�� ����");
	}
	
	//Read = Select
	public void carSelect(){
		System.out.println("CAR ������ ����� �Ǿ����ϴ�.");
	}
	
}
