package justtestin27dec21;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,temp,reverse=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Kindly enter the number");
		no= obj.nextInt();
		temp=no;
		
		while(no>0) {
			int remainder=no%10;
			reverse=reverse*10+remainder;
			no=no/10;
		}
		System.out.println("The reverse of the given no:" +reverse);
		if(reverse==temp) {
		
			System.out.println("No is palindrome");
			
	}
		else {
			System.out.println("No is not palindrome");
		}

}
}
