package fc.java.part4.inter;

public class TV implements InterfaceRemoCon{

	private int currcUp   = 99;	// 현재 98 번 채널
	private int currcDown = 1;	// 현재 1 번 채널
	
	//chUp(), chDown(), volUp(), volDown()
	
	@Override
	public void chUp() {
	    currcUp++;	// [test] Up버튼을 클릭할 시
		if(currcUp > InterfaceRemoCon.MAXCH) {
			// MAXCH 는 99 이므로 99이상 일시 다시 채널 1 로
			currcUp = 1;
		}
		System.out.println("TV 채녈이 올라간다.");	
		System.out.println("채 널 : " + currcUp);
	}

	@Override
	public void chDown() {
	    currcDown--; // [test] Down버튼을 클릭할 시	
		if(currcDown < InterfaceRemoCon.MINCH) {
			// MINCH 는 1 이므로 1이하 일시 다시 채널 99 로
			currcDown = 99;
		}	
		System.out.println("TV 채녈이 내려간다.");	
		System.out.println("채 널 : " + currcDown);
		
	}

	@Override
	public void volUp() {
		System.out.println("TV 소리가 올라간다.");		
	}

	@Override
	public void volDown() {
		System.out.println("TV 소리가 내려간다. ");		
		
	}
	
	@Override
	public void internet() {
		System.out.println("TV 에서는 인터넷 구동이 됩니다.");
	}
	
}

	// Quiz 1. 서로 비슷한 클래스의 공통부분을 묶을 때 사용하는 클래스를 무엇이라고 하는가 ? [X]
	// -> 추상클래스 
	// Quiz 2. 서로 다른 클래스의 공통부분을 묶을때 사용하는 클래스를 무엇이라고 하는가? [X]
	// -> 인터페이스
	// Quiz 3. 인터페이스가 가질 수있는 멤버 2가지를 쓰세요. [X]
	// -> 추상메서드, final static 상수
	// Quiz 4. 다형성을 보장하기 위해서 등장된 클래스 2가지를 쓰세요. [X]
	// -> 인터페이스, 추상클래스
	// Quiz 5. Dog클래스는 Animal클래스를 상속받고 Pet 인터페이스를 구현했다와 같은 코드를 작성하시오. [O]
	/*
	 *  public class Dog extends Animal implements Pet{
	 *	
	 *	}
	 *
	 */





