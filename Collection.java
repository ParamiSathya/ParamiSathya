package justtestin27dec21;


import java.util.ArrayList;
import java.util.Stack;
public class Collection {
	public Collection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Giri");
		a1.add(1,"Sri");
		a1.add("Testing");
		System.out.println(a1);
		Stack<Integer>s1=new Stack<>();
		s1.add(10);
		s1.push(25);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);


	}

}
