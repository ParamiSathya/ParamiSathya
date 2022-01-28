package justtestin27dec21;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car  TN01AC1145=new Car();
     int mod,maxspeed;
     boolean auto,ele;
     Scanner obj=new Scanner(System.in);
     int price=0;
     price=TN01AC1145.calcprice(200,2021,true,false);
     System.out.println(price);
     price=TN01AC1145.calcprice(240,2021,true,true);
     System.out.println(price);
     price=TN01AC1145.calcprice(220,2021,false,false);
     System.out.println(price);
     price=TN01AC1145.calcprice(260,2021,false,true);
     System.out.println(price);
     
	}

}
