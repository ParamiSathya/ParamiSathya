package justtestin27dec21;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int mark;
	System.out.println("Enter the mark: " );
	Scanner obj=new Scanner(System.in);
	mark=obj.nextInt();
	if(mark<70) {
		System.out.println("Fail");
	}
	else {
		System.out.println("pass");
	}
}
}


