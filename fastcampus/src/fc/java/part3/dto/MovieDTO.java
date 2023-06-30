package fc.java.part3.dto;

public class MovieDTO {

	private String title;	// ��ȭ����
	private int day;		// ������
	private String major;	// ���ΰ�
	private String part;	// �帣
	private float time;		// ����Ÿ��
	private int level;		// ���
	
	//Default ������
	public MovieDTO() {
		//�ʱ�ȭ ����
	}
	
	public MovieDTO(String title, int day, String major, String part, float time, int level) {
		this.title = title;
		this.day   = day;
		this.major = major;
		this.part  = part;
		this.time  = time;
		this.level = level;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "MovieDTO [title=" + title + ", day=" + day + ", major=" + major + ", part=" + part + ", time="
				+ time + ", level=" + level + "]";
	}
	
	
	
	
}
