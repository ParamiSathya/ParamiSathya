package justtestin27dec21;

import java.util.Scanner;

public class Calc {
int add(int a,int b) {
	return a+b;
}
int sub(int a,int b) {
	return a-b;
}
int mul(int a,int b) {
	return a*b;
}
int div(int a,int b) {
	return a/b;
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int v1,v2,r1,r2,r3,r4,add,sub,mul,div;
	Calc  clc=new Calc();
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value1");
	v1=obj.nextInt();
	System.out.println("Enter the value2");
	v2=obj.nextInt();
	r1=clc.add(v1,v2);
	System.out.println(r1);
	r2=clc.sub(v1,v2);
	System.out.println(r2);
	r3=clc.mul(v1,v2);
	System.out.println(r3);
	r4=clc.div(v1,v2);
	System.out.println(r4);
}
}