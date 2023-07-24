package fc.java.course2.part1.model2.Book;

import java.util.Arrays;

public class BookArray {
	
	private final int DEFAULT_CAPACITY = 5;	// 수정불가 (final 을 사용하기 때문에 변수가 아닌 상수)
	
	private BookVO[] elements;
	private int size = 0;
	
	//생성 동장
	public BookArray() {
		elements = new BookVO[DEFAULT_CAPACITY]; //5개 크기 배열
	}
	
	//저장 동작
	public void add(BookVO element) {
		//크기 체크 [ if ]
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	//얻는 동작
	public BookVO get(int index) { 
		// index 체크 [ if ] 배열에 없는 수가 있을 수 있으므로
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index 범위(0-9) 초과됨");
		}
		return elements[index];
		
	}
	
	// 원소의 개수는 넘겨주는 동작
	public int size() {
		return size;
	}

	private void ensureCapacity() {	
		int newCapacity = elements.length*2;
		elements = Arrays.copyOf(elements, newCapacity);
	}
}
