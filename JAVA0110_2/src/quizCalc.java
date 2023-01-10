
public class quizCalc {
	
	double[] calc(int ... values){
		double[] calc = new double[2];
		
		for(int i = 0; i < values.length; i++) {
			calc[0] += values[i];
		}
		calc[1] = calc[0]/values.length;
		
		return calc;
	}
	
}
