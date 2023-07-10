
public class PrintExample {
	
	public static void main(String[] args) {
		System.out.printf("ch = [%c]\n", 'A');
		System.out.printf("ch = [%18c]\n", 'A');
		System.out.printf("ch = [%-18c]\n", 'A');
		
		System.out.printf("str = [%s]\n", "Hello");
		System.out.printf("str = [%10s]\n", "Hello");
		System.out.printf("str = [%-10s]\n", "Hello");
	}
	
	
	public static void main4(String[] args) {
		System.out.printf("real = [%f]\n", 10.769);
		System.out.printf("real = [%20f]\n", 10.769);
		System.out.printf("real = [%-20f]\n", 10.769);
		System.out.printf("real = [%020f]\n", 10.769);
		System.out.printf("real = [%+20f]\n", 10.769);
		System.out.printf("real = [%20.2f]\n", 10.769);
		
	}
	
	public static void main3(String[] args) {
		System.out.printf("num = [%d]", 100);
		System.out.printf("num = [%10d]", 99);
		System.out.printf("num = [-10d]", 99);
		System.out.println("num = [");
		
		}
		
		
	

	public static void main1(String[] args) {
		System.out.print("hello\n");
		System.out.println("hello");
		System.out.print("hello\n");
		
	}
	
//	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		
//		int result = num1 + num2;
//		
//		System.out.println(result);
//
//	}

}