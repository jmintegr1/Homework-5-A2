package classWithinClass;

public class MotherClass { // Also known as Outer Class

	private InnerClassSon innerA = new InnerClassSon();

	public static void OuterMethod1() {
		System.out.println("MotherClass 1st method");

	}

	public void OuterMethod2() {
		System.out.println("MotherClass 2nd method");

	}

	public class InnerClassSon { // Aka inner class
		public void InnerMethod1() {
			System.out.println("Son inner class 1st method");
		}

		public void InnerMethod2() {
			System.out.println("Son inner class 2nd method");
		}

		public class InnerClassDaughter {

			public void InnerMethod1() {
				System.out.println("Daughter inner class 1st  method");
			}

			public void InnerMethod2() {
				System.out.println("Daughter inner 2nd method");
			}
		
		}
		public class InnerClassFamilyPet {

			public void InnerMethod1() {
				System.out.println("FamilyPet inner class 1st method");
			}

			public void InnerMethod2() {
				System.out.println("FamilyPet inner class 2nd method");

			}
		}
	}
}
