package justtestin27dec21;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		
		int a,a1,a2,a3,a4,result;
		System.out.println("Enter the value ");
		 a=obj.nextInt();
		 a1=a%3;
		 System.out.println(a1);
		 
		 a2=a%7;
		 System.out.println(a2);
		 a3=a%17;
		 System.out.println(a3);
		 a4=a%25;
		 System.out.println(a4);
		 result=a1+a2+a3+a4;
		 System.out.println("Sumation of the remainder:" +result);
		 if(result/2==0) {
			 System.out.println("Result is Even");
		 }
		 else {
			 System.out.println("Result is Odd");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		 
		 }
	}

}
