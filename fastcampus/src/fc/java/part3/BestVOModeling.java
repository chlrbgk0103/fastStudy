package fc.java.part3;

import fc.java.part3.dto.MovieDTO;

// 잘 설계된 VO 클래스란?
// 1. 모든 생태정보를 정보은닉하기(private)
// 2. 디폴트 생성자 반드시 만들기
// 3. 생성자 메서드를 오버로딩 하여 객체 초기화 하기
// 4. setter 메서드를 만들기(값을 저장용도)
// 5. getter 메서드를 만들어(값을 얻기용도)
// 6. toString() 메서드를 만들기 (객체가 가지고 있는 전체 값 출력 용도)

public class BestVOModeling {

	
	public static void main(String[] args) {
		
		MovieDTO dto = new MovieDTO("아바타",2022,"제이크셜리","액션",192.0f,12);
		System.out.println(dto.toString());
		
		//Quiz1. 다른 객체에서 자신의 정보를 숨기고 클래스 외부에서 특정정보에 접근을 막는다는 의미를 무엇이라고 하는가?
		// -> 정보은닉
		//Quiz2. 정보은닉 된 정보에 접근하는 방법 중 값을 저장하는 메서드를 무엇이라고 하는가?
		// -> [setter : 저장]
		//Quiz3.정보은닉 된 정보에 접근하는 방법 중 값을 얻어오는 메서드를 무엇이라고 하는가?
		// -> [getter]
		//Quiz4. 정보은닉 된 정보에 접근하는 방법 중 객체를 초기화를 통해 접근하는 메서드는 무엇인가?
		// -> 생성자 메서드
		//Quiz5. 객체가 가지고 있는 값 전체를 문자열 형태로 넘겨주기 위해서 만드는 메서드는 무엇인가?
		// -> toString
		
	}
	
}
