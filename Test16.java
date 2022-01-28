package justtestin27dec21;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc  clc=new Calc();
		Scanner obj=new Scanner(System.in);
		int a,b,add,sub,mul,div;
		int r1=clc.add(10,20);
		int r2=clc.sub(30,20);
		int r3=clc.mul(10,20);
		int r4=clc.div(10,20);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
