package justtestin27dec21;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your choice \n 1)English \n2)Tamil \nHindi\n");
		int choice=obj.nextInt();
		switch (choice) 
		{
		case 1:
		System.out.println("Enter your choice \\n 1)Check Balance \\n2)Last Recharge \\n3)Net Balance\\n");
		int m1=obj.nextInt();
		switch(m1)
		{
		case 1:
		System.out.println("Your Balance is 21\n");
		break;

		case 2:
		System.out.println("Your Last Recharge was...... is 21\n");
		break;

		case 3:
		System.out.println("Your Net Balance is \n");
		break;
		}
		break;
		case 2:
System.out.println("Ungal ennai padhividavum \n 1)balance checj panna\n 2)Kadantha recharge check panna");
			
			
		}
		}
	}


