package fc.java.part3;

import fc.java.part3.dto.CarDTO;	//클래스 풀네임

public class CarUtilityTest {

	//Q.Car 정보를 출력하는 동작을 가지고 있는 유틸리티클래스를 설계하세요.		

	public static void main(String[] args) {

		CarDTO car = new CarDTO();
		CarUtility.carPrint(car);
		
	}
	
	//Quiz1. 객체지향프로그래밍에서 클래스를 역할에 따라 부르는 이름을 무엇이라 하는가
	// ->  model
	//Quiz2. 우리가 클래스로 만들어 사용하게 될 모델의 종류 3가지를 쓰세요.
	// -> dto, dao, utiliy 
	//Quiz3. 객체 데이터를 하나로 수집해야 하는 경우에 필요한 모델을 무엇이라고 하는가.
	// -> dto
	//Quiz4. 데이터베이스를 데이터를 저장, 수정하거나 검색, 삭제를 하기 위해서 만들어지는 모델을 무엇이라고 하는가?
	// -> dao
	//Quiz5. CRUD의 생략된 영어와 의미를 작성하세요.
	// -> CREATE, READ, UPDATE, DELETE

}
