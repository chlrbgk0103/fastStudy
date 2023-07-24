package fc.java.course2.part1.model2.Object;

import fc.java.course2.part1.model2.*;

public class MyObjectArrayTest {

	public static void main(String[] args) {
		
		// A, B, C ��ü�� �迭(Object[])�� �����ϰ� ����ϼ���.
		// Book, Move, Member ��ü�� �迭(Object[])�� �����ϰ� ����ϼ���.
		
		ObjectArray list = new ObjectArray();
		
		list.add(new A()); // Upcasting Object element = new A();
		list.add(new B()); // Upcasting Object element = new B();
		list.add(new C()); // Upcasting Object element = new C();
		
		A a = (A)list.get(0);	// A = Object;
		a.display();
		
		B b = (B)list.get(1);	// B = Object;
		b.display();
		
		C c = (C)list.get(2);	// C = Object;
		c.display();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof A) {
				((A)list.get(i)).display(); 
				}else if(list.get(i) instanceof B) {
					((B)list.get(i)).display();
				}else {
					((C)list.get(i)).display();
			}
		}
		
	}
	
}
