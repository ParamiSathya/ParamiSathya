package justtestin27dec21;

import java.util.Scanner;

public class Addvoid ( int a, int b) {
	
	this.a=a;
	this.b=b;
}
int add() {
	return a+b;
}
int sub() {
	return a-b;
}
int mul() {
	return a*b;
}
int div() {
	return a/b;
}
void printval()
{
	System.out.println("add"+add());
	System.out.println("sub"+sub());
	System.out.println("mul"+mul());
	System.out.println("div"+div());
}
}
