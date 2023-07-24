package fc.java.course2.part1.model2.Book;

import java.util.Arrays;

public class BookArray {
	
	private final int DEFAULT_CAPACITY = 5;	// �����Ұ� (final �� ����ϱ� ������ ������ �ƴ� ���)
	
	private BookVO[] elements;
	private int size = 0;
	
	//���� ����
	public BookArray() {
		elements = new BookVO[DEFAULT_CAPACITY]; //5�� ũ�� �迭
	}
	
	//���� ����
	public void add(BookVO element) {
		//ũ�� üũ [ if ]
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	//��� ����
	public BookVO get(int index) { 
		// index üũ [ if ] �迭�� ���� ���� ���� �� �����Ƿ�
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index ����(0-9) �ʰ���");
		}
		return elements[index];
		
	}
	
	// ������ ������ �Ѱ��ִ� ����
	public int size() {
		return size;
	}

	private void ensureCapacity() {	
		int newCapacity = elements.length*2;
		elements = Arrays.copyOf(elements, newCapacity);
	}
}
