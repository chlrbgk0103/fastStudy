package fc.java.part4.poly.object;

public class ObjectToString {

	public static void main(String[] args) {
		Board board = new Board();
		board.setTitle("�Խñ� �Դϴ�.");
		
		System.out.println(board.getTitle());
		 
		// fc.java.part4.poly.object.Board@4517d9a3
		// ������ �ϸ� ���ϴ� �Խñ� ��� �ذ�ȴ�.
		System.out.println(board.toString());	// board �� ���� ���	

	}
	
}
