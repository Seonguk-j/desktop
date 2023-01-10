
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 1, newStrArray, 1, 2);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " ");
		}
		
		System.out.println();
		String[] newStrArray2 = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray2, 2, 2);
		
		for(int i = 0; i < newStrArray2.length; i++) {
			System.out.print(newStrArray2[i] + " ");
		}
		
		System.out.println();
		String[] newStrArray3 = new String[5];
		for(int i = 0; i < oldStrArray.length; i++) {
			newStrArray3[2 * i] = oldStrArray[i];
		}
		for(int i = 0; i < newStrArray3.length; i++) {
			System.out.print(newStrArray3[i] + " ");
		}
	}

}
