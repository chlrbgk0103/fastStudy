package fc.java.part4.poly.object;


// toString() : ��ü�� ������ ���ڿ��� ���
public class Board extends Object{

	// EX.[����]
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {		
		super.toString();	// ����Ŭ������ �޼��� ȣ��
		return "Board [title=" + title + "]";
	}
	
}
