package justtestin27dec21;

import java.util.Scanner;

public class Arg {
	void main() {
		System.out.println("Inside Main");
				}
	void main(int i) {
		for(int j=0;j<i;j++) {
			System.out.println("Inside main function which takes an integer");
		}
	}
	int main(int i, int j) {
		return i+j;
	}
	public static void main(String[] args) {
		Arg t1=new Arg();
		t1.main();
		t1.main(1);
		System.out.println(t1.main(30,89));

}
}
