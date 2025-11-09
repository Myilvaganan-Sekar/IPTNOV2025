
public class KeywordsExample {
/* static --> variable, method,block
 */
	static {
		System.out.println("Static block");
	}
	int a = 10; // Non static
	static int b  = 20; // static	
	public void apple() { // Non static method
		System.out.println("Green Apple");
	}
	
	public static void orange() { // static method
		System.out.println("Orange");
	}
	
	public static void main(String[] args) {
		KeywordsExample keyExam = new KeywordsExample();
		keyExam.apple();		
		System.out.println("A: "+keyExam.a);
		System.out.println("B: "+b);
	}
}
