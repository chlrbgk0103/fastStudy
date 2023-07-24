package fc.java.course2.part1.model2.Book;

// 잘 계된 VO 또는 DTO
public class BookVO {
	
	// 멤버변수, 상태정보, 속성(property)
	private String title;
	private int price;
	private String company;
	private String author;
	
	// 디폴트 생성자
	public BookVO() {
		
	}

	// 생성자메서드의 중복정의(overloading)
	public BookVO(String title, int price, String company, String author) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.author = author;
	}

	//setter,getter (저장, 출력)
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
	
	
	
	// Object -> toString() 재정의 
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", company=" + company + ", author=" + author + "]";
	}
	
	
	
	
	
	
}
