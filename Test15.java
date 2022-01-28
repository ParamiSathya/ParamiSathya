package justtestin27dec21;

public class Test15 {
	int a1;
	int a2;
	int a3;
	int a4;
	boolean calbase;
	boolean addition;
	boolean subtraction;
	boolean multiplication;
	int calcvalue(int add,int sub,int mul,int div) {
		if (calbase==true) {
		if(addition==true) {
			return a1+a2;
		}
		else {
			return a1-a2;
		}
		}
		else if(multiplication==true) {
			return a1*a2;
			
		}
		else {
			return a1/a2;
		}
	}

}
