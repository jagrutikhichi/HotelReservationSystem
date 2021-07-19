package HotelReservationSystem;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HotelReservationMain {

	//declaring variables for respective hotels
		 private static Hotels lake, bridge, ridge;

		 public static void main(String[] args) throws IOException {
			System.out.println("Welcome To Hotel Reservation Program");
			System.out.println("Enter date  ex. 16Mar2020(mon)");
			Scanner s = new Scanner(System.in);
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        String date = bf.readLine();

			
			//setting values for lakewood
		    lake = new Hotels("Lakewood");
		    lake.setWeekDay(110);
		    
			 		
			//setting values for bridgewood
		    bridge = new Hotels("Bridgewood");
		    bridge.setWeekDay(160);
		   
					
			//setting values for ridgewood   
		    ridge = new Hotels("Ridgewood");
		    ridge.setWeekDay(220);
		    
			
			 //int index = date.indexOf(":");
		     //String type = date.substring(0, index);
		     int cost_lake = 0, cost_bridge = 0, cost_ridge = 0;
		     int day_index_start = 0, day_index_end = 0;
		     
		    while (day_index_start != -1) {
			     day_index_start = date.indexOf("(", day_index_start + 1);
			     day_index_end = date.indexOf(")", day_index_end + 1);
			
			     if (day_index_start != -1) {
				     String day = date.substring(day_index_start + 1, day_index_end);
					    
						     cost_lake += lake.getWeekDay();
						     cost_bridge += bridge.getWeekDay();
						     cost_ridge += ridge.getWeekDay();
					     
				     }
			     }  
		    
		     System.out.println("\nLakewood : "+cost_lake+"$");
		     System.out.println("Bridgewood : "+cost_bridge+"$");
		     System.out.println("Ridgewood : "+cost_ridge+"$");
		
		     String result = min(cost_lake, cost_bridge, cost_ridge);
		     System.out.println("Cheapest price is of "+result);
	    	}
	    	
	     //implementing the min method
	     private static String min(int a, int b, int c) {
		     if (a < b && a < c) {
		    	 return lake.getHotelName();
		     } else if (b < a && b < c) {
		    	 return bridge.getHotelName();
		     } else if (c < a && c < b) {
		    	 return ridge.getHotelName();
		     } else if (a == b || b == c) {
		    	 return bridge.getHotelName();
		     } else if (c == a) {
		    	 return ridge.getHotelName();
		     } else {
		    	 return lake.getHotelName();
		     } 
		}
	}
