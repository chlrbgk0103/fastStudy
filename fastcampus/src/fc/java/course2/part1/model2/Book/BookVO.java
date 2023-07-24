package fc.java.course2.part1.model2.Book;

// �� ��� VO �Ǵ� DTO
public class BookVO {
	
	// �������, ��������, �Ӽ�(property)
	private String title;
	private int price;
	private String company;
	private String author;
	
	// ����Ʈ ������
	public BookVO() {
		
	}

	// �����ڸ޼����� �ߺ�����(overloading)
	public BookVO(String title, int price, String company, String author) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.author = author;
	}

	//setter,getter (����, ���)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	// Object -> toString() ������ 
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", company=" + company + ", author=" + author + "]";
	}
	
	
	
	
	
	
}
