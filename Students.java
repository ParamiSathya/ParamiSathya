package justtestin27dec21;

import java.util.Scanner;

public class Students {
	
	String Name;
	int Mark;
	int Age;
	String Gender;
	int Roll_no;
	int Class;
	String Qulaification;
	boolean Graduate;
	boolean MSc;
	void Name() {
		System.out.println("Name");
	}
	void Age() {
		System.out.println("Age:");
	}
	void Roll_no() {
		System.out.println("Roll_no:");
	}
	void Mark() {
		System.out.println("Mark:");
	
		
	}
	
	
	void Class() {
		System.out.println("Class:");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students  s=new Students();
		Scanner obj=new Scanner(System.in);
		int no,Class,Age,Roll_no;
		String Name;
		int Mark;
		s.Name();
		Name= obj.next();
		s.Age();
		Age= obj.nextInt();
		s.Roll_no();
		Roll_no= obj.nextInt();
		s.Mark();
		Mark= obj.nextInt();
		if(Mark<70) {
			System.out.println("Fail");
		}
		else {
			System.out.println("pass");
		}
		s.Class();
		Class= obj.nextInt();
		if(Class<=5) {
			System.out.println("Primary");
		}
		else {
			System.out.println("Higher Secondary");
		}
		
		
		
	}		

}
 
	
	
	