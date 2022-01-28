package justtestin27dec21;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,sum;
		a=10;
		b=50;
		c=20;
		sum=1;
	if(a>b)
		{
		if(a>c)
		{
			System.out.println("a is the highest no");
		}
		else {
			System.out.println("c is the highest no");
			
		}
		}
		else { 
			if(b>c)
		 {
			System.out.println("b is the highest no");
		 }
			else {
				System.out.println("c is the highest no");
			     }
		
		}
	for(int i=1;i<=10;i++) {
		System.out.println("print" +i);
		sum = sum * i;
	}
	System.out.println("factorial of +i");

	}

}
