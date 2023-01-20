import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
			System.out.print(printAnnotation.event());
			method.invoke(new Service());
			System.out.print(printAnnotation.event());
			System.out.println();
			printLine(printAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {

			int number = printAnnotation.number();
			for(int i = 0; i < number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
