package fc.java.course2.part1;

import fc.java.course2.part1.model2.IntArray;

public class MyIntArrayTest {

	public static void main(String[] args) {
		
		// ���� 3���� �迭�� �����ϰ� ����ϼ���.
		IntArray list = new IntArray(); // 5���� ������ �迭
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

	
		for(int i=0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
