package justtestin27dec21;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,r,temp,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Kindly enter the number");
		no= obj.nextInt();
		temp=no;
		
		while(no>0) {
			 r=no%10;
			sum=sum+r*r*r;
			
			no=no/10;
		}
		System.out.println(sum );
		if(sum==temp) {
		
			System.out.println("Amstrong");
			
	}
		else {
			System.out.println("Not an Amstrong");
		}

}
}
