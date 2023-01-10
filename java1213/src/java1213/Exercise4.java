package java1213;

public class Exercise4 {

	public static void main(String[] args) {
		StudentNew s = new StudentNew("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());
	}

}

class StudentNew {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	StudentNew(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage() {
		return Math.round(getTotal() / 3f * 10) / 10f;
	}
	
	String info() {
		String str;
		str = name + ", ";
		str += Integer.toString(ban) + ", ";
		str += Integer.toString(no) + ", ";
		str += Integer.toString(kor) + ", ";
		str += Integer.toString(eng) + ", ";
		str += Integer.toString(math) + ", ";
		str += Integer.toString(getTotal()) + ", ";
		str += Float.toString(getAverage());
		
		return str;
	}
}