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
