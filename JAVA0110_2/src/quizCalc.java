
public class quizCalc {
	
	int sum(int ... values){
		int total = 0;
		
		for(int i = 0; i < values.length; i++) {
			total += values[i];
		}
		
		return total;
	}
	
	double avg(int ... values) {
		double average;
		int total = 0;
		
		for(int i = 0; i < values.length; i++) {
			total += values[i];
		}
		average = (double)total/values.length;
		
		return average;
	}
}
