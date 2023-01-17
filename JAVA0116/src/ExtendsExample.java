
public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
//		ib.methodC();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
