// Q1.��ȭ, ���, å �̷� �ڷ����� � �ڷ����̶�� �ϴ°�?
// -> ����� ���� �ڷ��� or ��ü �ڷ���
// Q2.Ŭ������ �������� ������.
// -> ���ο� �ڷ����� ����� ����
// Q3.��ü�� �޸𸮿� �ø��� ������ �����̶�� �ϴ°�?
// -> ��ü����
// Q4.��ü�� �����ϰ� �ִ� 2���� ������ ������
// -> ��������, ��������
// Q5.��ü �����ϴ� ������ ������ �ִ� �޼��带 �����̶�� �ϴ°�?
// -> ������ �޼���
// Q6.��ü�� ������ �� �ڱ� �ڽ��� ����Ű�� ���۷��� ������ �����ΰ�?
// -> this
// Q7.��(Heap Memory)�� ������� ��ü�� �����̶�� �ϴ°�(��ü�� ��ü�� �θ��� ��)?
// -> �ν��Ͻ�

package fc.java.part3;

import fc.java.part3.dto.PersonDTO;

public class Person {

	//Q.�̸�, ����, ��ȭ��ȣ ���������� �,�Դ�,�ȴ� ���������� ������ �ִ� Person Ŭ������ �𵨸� �ϼ���.
	
	public static void main(String[] args) {
		
		PersonDTO personDTO = new PersonDTO();
		// personDTO -- > ��ü(�ν��Ͻ� ����)
		// �׳� PersonDTO personDTO �� personDTO �� ��ü(����) �ν��Ͻ� ���� x
		// new������ (������)�޼���()
		
		personDTO.phone = "010";
		personDTO.name  = "����";
		personDTO.age   = 1;
		
		PersonDTO.play();
		PersonDTO.eat();
		PersonDTO.walk();

		System.out.println("person : " + " [ �̸� ] : " + personDTO.name + " [ ���� ] : " + personDTO.age + " [ ��ȭ��ȣ ] : " + personDTO.phone );
		

	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
}
