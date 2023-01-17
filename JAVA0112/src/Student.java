//학생 : 부모

public class Student {
	//protected : 같은 클래스 내에서 사용, 자식 클래스에서 사용 가능
	protected String name;		//이름		
	protected int number;		//학번
	
	public Student() {
		name = "";
		number = 0;
	}
	
	// 이름을 매개변수 값으로 초기화하면서 Student 객체를 생성한다.
	public Student(String Name, int Number) {
		setName(Name);
		setNumber(Number);
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int Number) {
		this.number = Number;
	}
	
	public String toString() {
		return("이름 : " + name + ", 학번 : " + number);
	}
	
	//현 객체의 현재 상태가 other 객체와 같은지를 알려준다
	public boolean equals(Student other) {
		return(this.name.contentEquals(other.name) && (this.number == other.number));
	}
}
