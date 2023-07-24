package fc.java.course2.part1.model2.Object;

import java.util.Arrays;

public class ObjectArray {
	
	private final int DEFAULT_CAPACITY = 5;	// �����Ұ� (final �� ����ϱ� ������ ������ �ƴ� ���)
	
	private Object[] elements;	// ������ �迭
	private int size = 0;
	
	//���� ����
	public ObjectArray() {
		// elements = new Object[DEFAULT_CAPACITY]; //5�� ũ�� �迭
		this(5);	//�����ھȿ��� �ٸ� �����ڸ� ȣ�� �Ҷ� ���.
	}
	
	public ObjectArray(int capacity) {
		elements = new Object[DEFAULT_CAPACITY]; // ���ϴ� ũ���� �迭�� ����
	}
	
	//���� ����
	public void add(Object element) {
		//ũ�� üũ [ if ]
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	//��� ����
	public Object get(int index) { 
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
