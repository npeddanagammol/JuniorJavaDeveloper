package exceptionHandling;

public class Demo {

	static int a = 1;
	static int b = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math();
		stringArray();

	}

	public static void math() {
		int c;
		try{
			c = a / b;
		}catch(ArithmeticException e) {
			System.out.println("ERROR: Arithmetic Exception");
			System.out.println("ERROR: "+e);
		}
	}
	
	public static void stringArray() {
		String[] animals = {"Bull", "Horse", "Cow", "Dog","Cat", "Monkey"};
		try {
			for (int i = 0; i <= animals.length; i++) {
				System.out.println(animals[i]);
			} 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: Out of index range.");
			System.out.println("ERROR: "+e);
		}
	}

}
