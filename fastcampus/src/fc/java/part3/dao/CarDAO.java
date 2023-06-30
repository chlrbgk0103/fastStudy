package fc.java.part3.dao;

import fc.java.part3.dto.CarDTO;

// DAO (Data Access Object)
// CRUD 동작을 가지고있는 클래스, 비즈니스 로직을 처리하는 클래스
public class CarDAO {
	// C R U D
	
	// Create = insertㄴ
	public void carInsert(CarDTO car) {
		System.out.println("CAR 정보를 DB에 저장");
	}
	
	//Read = Select
	public void carSelect(){
		System.out.println("CAR 정보가 출력이 되었습니다.");
	}
	
}
