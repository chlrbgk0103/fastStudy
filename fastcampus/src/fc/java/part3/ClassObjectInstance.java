package fc.java.part3;

import fc.java.part3.dto.Student;

public class ClassObjectInstance {

	public static void main(String[] args) {
		
		Student st1;	// st1 : Object
		Student st2;	// st2 : Object
		Student st3;	// st3 : Object
		
		st1 = new Student("ȫ","�İ�",31,"bit0@email",202301,"010-1111"); // st1 : Instance
		st2 = new Student("��","����",31,"bit1@email",202302,"010-2222"); // st2 : Instance
		st3 = new Student("��","����",31,"bit2@email",202303,"010-3333"); // st3 : Instance
		
		System.out.println(st1.toString());
		System.out.println(st2);	// toString ���� ����
		System.out.println(st3);
	}
	
}

	//Quiz1. Ŭ������ ����ϴ� �������� ���ѹ� �޸𸮿� �ε��ϱ� ���ؼ� ����ϴ� Ű����� �����ΰ�.
	// -> static
	//Quiz2. ������ JVM���� ����ϴ� �޸� �� � �޸𸮸� �����ϰ� �ִ��� ������.
	//	- �޼��尡 ȣ��Ǹ� ȣ��� ���� �ڵ尡 push�ǰ� ����Ǵ� �޸� ����
	//	- ���� ���α׷��� ���� �ǰ� �ִ� ���¸� �ľ��� ���ִ�.
	//  - LIFO �����̴�.
	// -> Call Stack Frame Area
	//Quiz3. ��ü������ �������� ��� �ϸ� �Ǵ°�?
	// -> �����ڸ� private
	//Quiz4. ��ü������ ���� �޸�(Heap Memory)�� ������� ��ü�� �����̶�� �ϴ°�?
	// -> �ν��Ͻ�
	//Quiz5. JVM�� ����ϴ� �޸� 4���� ���� ������.
	// -> Method, Heap, Stack, Literal POOL
