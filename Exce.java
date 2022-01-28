package justtestin27dec21;

public class Exce {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
	try {
		int x;
		int a=2;
		int b=5;
		int c=7;
		int d=7;
		x=((a+b)/(c-d));
	}
	catch(ArithmeticException e) {
 System.out.println("print x\t");
}
	finally {
		System.out.println("Hello");
	}
}
}