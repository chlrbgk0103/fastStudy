package fc.java.part4.poly.object;

public class ObjectToString {

	public static void main(String[] args) {
		Board board = new Board();
		board.setTitle("게시글 입니다.");
		
		System.out.println(board.getTitle());
		 
		// fc.java.part4.poly.object.Board@4517d9a3
		// 재정의 하면 원하는 게시글 출력 해결된다.
		System.out.println(board.toString());	// board 의 번지 출력	

	}
	
}
