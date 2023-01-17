//학부생 : 자식

public class Undergraduate extends Student {
	//대학생의 소속 동아리명을 지정하는 객체 변수
	private String clubName;
	
	//학부생의 변수 값을 기본 값으로 초기화하면서 객체를 생성
	public Undergraduate() {
		super();		//부모 클래스의 생성자 메소드를 호출	
		clubName = "";
	}
	
	//학부생의 변수들 값을 매개변수 값으로 초기화하면서 객체를 생성한다.
	public Undergraduate(String Name, int Number, String ClubName) {
		super(Name, Number);
		setClubName(ClubName);
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String ClubName) {
		this.clubName = ClubName;
	}
	
	//현 객체의 현재 상태를 나타내는 문자열을 반환한다.
	public String toString() {
		return super.toString() + ", 동아리 이름 : " + getClubName();
	}
	
	//현 객체의 현재 상태가 other 객체와 같은지를 알려준다.
	public boolean equals(Undergraduate other) {
		return (super.equals(other)) && (this.clubName.equals(other.clubName));
	}
}
