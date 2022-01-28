package justtestin27dec21;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a;
		long fact;
		fact=1;
		for(a=1;a<=4;a++) {
			fact = fact * a;
			System.out.println(a+"\t"+fact);
		}
		System.out.println("\n\nfact\t:\t"+fact);
		
		if(fact<1700) {
			System.out.println("Suji");
		}
		else {
			System.out.println("Giri");
		}
	

	}

}
