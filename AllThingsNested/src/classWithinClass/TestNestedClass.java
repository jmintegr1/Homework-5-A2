package classWithinClass;

public class TestNestedClass {

	public static void main(String[] args) {

		MotherClass motherClass = new MotherClass();
		MotherClass.InnerClassSon innerObject = motherClass.new InnerClassSon();
		innerObject.InnerMethod1();
		
	}

}
