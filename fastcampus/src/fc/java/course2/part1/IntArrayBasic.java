package fc.java.course2.part1;

public class IntArrayBasic {
	
	public static void main(String[] args) {
		
		//정수 5개를 배열에 저장하고 출력하세요.
		
		// 생성 동작
		int[] nums = new int[5];	//단점 : 고정길이 -> 가변길이는 ?
		
		nums[0] = 1;	// 저장 동작
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		for(int i=0; i < nums.length;i++) {
			int data = nums[i]; //데이터를 얻는 동작
			System.out.println(data);	//데이터를 얻는 동작
		}
		
		System.out.println("-- -- -- -- -- --- -- -- -- --");
		
		// 방법 2
		// 향상된 for문
		for(int data : nums) {
			System.out.println(data);
		}
		
		
		
		
		
		
		
		
		
	}
	
}
