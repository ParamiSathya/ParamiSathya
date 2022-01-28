package justtestin27dec21;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test15 calculation=new Test15();
		int a1;
		int a2;
		int a3;
		int a4;
		boolean calbase;
		boolean addition;
		boolean subtraction;
		boolean multiplication;
		Scanner obj=new Scanner(System.in);
	     int value=0;
	    value=calculation.calcvalue(200,2021,true,false);
	     System.out.println(value);
	     value=calculation.calcvalue(240,2021,true,true);
	     System.out.println(value);
	     value=calculation.calcvalue(220,2021,false,false);
	     System.out.println(value);
	     value=calculation.calcvalue(260,2021,false,true);
	     System.out.println(value);
	     
	}

}
