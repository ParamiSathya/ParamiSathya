package justtestin27dec21;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner (System.in);
		
		System.out.println("choose your option \n 1. Triangle \t\t 2. Circle\t\t 3. Square\t\t4. Rectangle");
				 int choice=obj.nextInt();
				 switch(choice) {
				 case 1:
					 int b,h;
					 double a1;
					 System.out.println("Enter the value for b");
					 b=obj.nextInt();
					 System.out.println("Enter the value for h");
					 h=obj.nextInt();
					 a1=0.5*b*h;
					 System.out.println("Area of the triangle =="  +a1);
					 
				 break;
				 case 2:
					 int r;
					 double a2;
					 System.out.println("Enter the value for r");
					 r=obj.nextInt();
					 a2=3.14*r*r;
					 System.out.println("Area of the circle == "+a2);
				 break;
				 case 3:
					 int a,a3;
					 System.out.println("Enter the value for a");
					 a=obj.nextInt();
					 a3=a*a;
					 System.out.println("Area of the square == "+a3);
				 break;
				 case 4:
					 int l,w,a4;
					 System.out.println("Enter the value for l");
					 l=obj.nextInt();
					 System.out.println("Enter the value for w");
					 w=obj.nextInt();
					 a4=l*w;
					
					 System.out.println("Area of the rectangle == "+a4);
				 break;
				 }
				
				 
				 
				 		
		
	}

}
