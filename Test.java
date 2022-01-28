package justtestin27dec21;

 public class Test {
	 int volume(int a) {
	  return (int) (a*a*a) ;
	  }
	 float volume(float r) {
		  return (float) ((4/3)*3.14*(r*3));
		 
		  }
	double volume(double r,int h) {
		 return (double) (3.14*(r*r)*h);
		 
	 }
 
 
	 
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
		 Test t1=new Test();
		 System.out.println("Volume of the Sphere\t" + t1.volume(4.0f));
		 System.out.println("Volume of the cylinder\t" +t1.volume(2,5));
		 
	 }
	 
	  

}
