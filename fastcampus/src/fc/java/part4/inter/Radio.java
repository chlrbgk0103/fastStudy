package fc.java.part4.inter;

public class Radio implements InterfaceRemoCon{

	@Override
	public void chUp() {
		System.out.println("라디오 채녈이 올라간다.");		
	}

	@Override
	public void chDown() {
		System.out.println("라디오 채녈이 내려간다.");		
	}

	@Override
	public void volUp() {
		System.out.println("라디오 소리가 올라간다.");		
	}

	@Override
	public void volDown() {
		System.out.println("라디오 소리가 내려간다. ");		
		
	}
	
	@Override
	public void internet() {
		System.out.println("라디오 에서는 인터넷 구동이 안됩니다.");
	}
	
}
