
public class InfinityExample {

	public static void main(String[] args) {
		double d1 = Double.POSITIVE_INFINITY;
		double d2 = -100/0.0;
		
		d1 = d1 * 99999;
		d2 = d2 / 99999;
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);

	}

}
