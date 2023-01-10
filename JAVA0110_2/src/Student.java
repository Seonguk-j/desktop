
public class Student {
	String name;
	int assignmentsScore;
	int examScore;
	char grade;
	
	public String toString() {
		double total = 0.4 * this.assignmentsScore + 0.6 * this.examScore;
		
		if(total >= 90)
			grade = 'A';
		else if(total >= 80)
			grade = 'B';
		else if(total >= 70)
			grade = 'C';
		else if(total >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		String str = "이름 : " + this.name + "\n과제 점수 : " + this.assignmentsScore + "\n시험 점수 : " + this.examScore + "\n학점 : " + this.grade;
		return str;
	}
}
