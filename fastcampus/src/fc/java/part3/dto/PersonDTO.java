package fc.java.part3.dto;

// Object = ��������(�������) + ��������(����޼���)

//������ �޼���//
public class PersonDTO {

// Q.�� ����� �����͸� ������ [������ ����]�ϼ���.	
	
	/***** �������� *****/
	public String name;		// �̸�
	public int age;			// ����
	public String phone;	// ��ȭ��ȣ
	
	// �⺻ �����ڸ޼��� (default ������)
	public PersonDTO() {
		//��ü�� �����ϴ� �ڵ� ����
	}

	/***** �������� *****/
	public static void play() {
		System.out.println("�");
	}
	
	public static void eat() {
		System.out.println("�Դ�");
	}
	
	public static void walk() {
		System.out.println("�ȴ�");
	}

}