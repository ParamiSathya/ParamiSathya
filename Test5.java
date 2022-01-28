package justtestin27dec21;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=60;
		c=45;
		int mark;
		Scanner obj=new Scanner (System.in);
		System.out.println("Kindly enter the mark");
		mark = obj.nextInt();
		
		if(mark==100) {
			System.out.println("A+");
		}
		else if(mark<100 && mark>90) {
			System.out.println("A");
		}
		else if(mark<=90 && mark>80){
			System.out.println("B+");
		}
		else if(mark<=80 && mark>70){
			System.out.println("B");
		}
		else if(mark<=70 && mark>0){
			System.out.println("c");
		}
		
		
		if(a<b && c<b) {
			System.out.println("a is the smallest");
		}
		if(b<a && b<c) {
			System.out.println("b is the smallest");
		}
		if(c<a && c<b) {
			System.out.println("c is the smallest");
		}

	}

}
