package justtestin27dec21;

public class Car {

	
		// TODO Auto-generated method stub
   String companyname;
   int model;
   boolean automatic;
   boolean electric;
   int price;
   int maxspeed;
   int calcprice (int maxspeed,  int model, boolean electric,  boolean automatic) {
   if(electric==true) {
	   if (automatic==true) {
		    return model*100*10*maxspeed;
	   }
	   else {
		   return model*100*maxspeed;
				   
	   }
   }
   else if(automatic==true) {
		   	return model*10*maxspeed;
	   
   }
	   else {
		   return model*maxspeed;
		  
	   }
   }
	}

