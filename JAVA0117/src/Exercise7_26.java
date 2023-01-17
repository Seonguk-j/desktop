//class Outer {
//	static class Inner {
//		int iv = 200;
//	}
//}

public class Exercise7_26 {
	public static void main(String[] args) {
		Outer.Inner out = new Outer.Inner();
		System.out.println(out.iv);
	}
}
