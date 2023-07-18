package fc.java.part4.inter;

public interface InterfaceRemoCon {
	
	/*
	public int MAXCH = 99;
	public int MINCH = 1;
	*/
	
	/* 위에 두개의 상수와 같은 표현 */
	public static final int MAXCH = 99;
	public static final int MINCH = 1;
	
	public abstract void chUp();
	public abstract void chDown();
	public abstract void volUp();
	public abstract void volDown();

	
// interface 사용 시 에는 구현 메소드는 사용 불가
	
/*	
	public void internet() {
		System.out.println("인터넷이 구동된다.");
	}
*/	
	
// internet 추상메서드로 변환
		public abstract void internet();
	
}
