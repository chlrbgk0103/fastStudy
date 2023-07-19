package fc.java.part4.poly.object;


// toString() : 객체의 번지를 문자열로 출력
public class Board extends Object{

	// EX.[제목]
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {		
		super.toString();	// 상위클래스의 메서드 호출
		return "Board [title=" + title + "]";
	}
	
}
