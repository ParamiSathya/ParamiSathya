package justtestin27dec21;

public class tryClass {

	String name;
	int age;
	int clss;
	public tryClass(String nam,int ag,int cls) {
		name=nam;
		age=ag;
		clss=cls;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		if(age<20) {
		System.out.println("hello 	"+name);
		} else {
			System.out.println("Hello big human 	"+name);
		}
	}
	
	public static void main(String[] args) {
		tryClass obj1 = new tryClass("roy", 10, 5);
		tryClass obj2 = new tryClass("mari Amma", 8, 4);
		tryClass obj3 = new tryClass("ancy", 80, 12);
		tryClass obj4 = new tryClass("Parmaaa", 30, 25);
		
		obj1.print();
		obj2.print();
		obj3.print();
		obj4.print();
	}	
}

