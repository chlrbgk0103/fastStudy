package fc.java.course2.part1.model2;

import java.util.Arrays;

public class IntArray {
	
	
	private final int DEFAULT_CAPACITY = 5;	// �����Ұ� (final �� ����ϱ� ������ ������ �ƴ� ���)
	
	private int[] elements;
	private int size = 0;
	
	//���� ����
	public IntArray() {
		elements = new int[DEFAULT_CAPACITY]; //5�� ũ�� �迭
	}
	
	//���� ����
	public void add(int element) {
		//ũ�� üũ [ if ]
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	//��� ����
	public int get(int index) { 
		// index üũ [ if ] �迭�� ���� ���� ���� �� �����Ƿ�
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
