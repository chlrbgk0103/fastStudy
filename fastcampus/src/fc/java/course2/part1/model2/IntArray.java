package fc.java.course2.part1.model2;

import java.util.Arrays;

public class IntArray {
	
	
	private final int DEFAULT_CAPACITY = 5;	// 수정불가 (final 을 사용하기 때문에 변수가 아닌 상수)
	
	private int[] elements;
	private int size = 0;
	
	//생성 동장
	public IntArray() {
		elements = new int[DEFAULT_CAPACITY]; //5개 크기 배열
	}
	
	//저장 동작
	public void add(int element) {
		//크기 체크 [ if ]
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	//얻는 동작
	public int get(int index) { 
		// index 체크 [ if ] 배열에 없는 수가 있을 수 있으므로
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
