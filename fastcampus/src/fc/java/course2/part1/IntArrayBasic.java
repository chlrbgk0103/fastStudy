package fc.java.course2.part1;

public class IntArrayBasic {
	
	public static void main(String[] args) {
		
		//���� 5���� �迭�� �����ϰ� ����ϼ���.
		
		// ���� ����
		int[] nums = new int[5];	//���� : �������� -> �������̴� ?
		
		nums[0] = 1;	// ���� ����
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		for(int i=0; i < nums.length;i++) {
			int data = nums[i]; //�����͸� ��� ����
			System.out.println(data);	//�����͸� ��� ����
		}
		
		System.out.println("-- -- -- -- -- --- -- -- -- --");
		
		// ��� 2
		// ���� for��
		for(int data : nums) {
			System.out.println(data);
		}
		
		
		
		
		
		
		
		
		
	}
	
}
