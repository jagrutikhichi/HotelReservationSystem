package HotelReservationSystem;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HotelReservationMain {

	// declaring variables for respective hotels
	private static Hotels lake, bridge, ridge;

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome To Hotel Reservation Program");

		// date pattern to be entered
		System.out.println("Enter date  ex. 16Mar2020(mon)");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String date = bf.readLine();

		// setting values for lakewood
		lake = new Hotels("Lakewood");
		lake.setRating(3);
		lake.setWeekDay(110);
		lake.setWeekEnd(90);

		// setting values for bridgewood
		bridge = new Hotels("Bridgewood");
		bridge.setRating(4);
		bridge.setWeekDay(150);
		bridge.setWeekEnd(50);

		// setting values for ridgewood
		ridge = new Hotels("Ridgewood");
		ridge.setRating(5);
		ridge.setWeekDay(220);
		ridge.setWeekEnd(150);

		// int index = date.indexOf(":");
		// String type = date.substring(0, index);
		int cost_lake = 0, cost_bridge = 0, cost_ridge = 0;
		int day_index_start = 0, day_index_end = 0;

		while (day_index_start != -1) {
			day_index_start = date.indexOf("(", day_index_start + 1);
			day_index_end = date.indexOf(")", day_index_end + 1);

			if (day_index_start != -1) {
				String day = date.substring(day_index_start + 1, day_index_end);
				if (day.equalsIgnoreCase("sun") || day.equalsIgnoreCase("sat")) {
					cost_lake += lake.getWeekEnd();
					cost_bridge += bridge.getWeekEnd();
					cost_ridge += ridge.getWeekEnd();
				} else {
					cost_lake += lake.getWeekDay();
					cost_bridge += bridge.getWeekDay();
					cost_ridge += ridge.getWeekDay();
				}
			}
		}
		// printing hotel costs
		System.out.println("\nLakewood : " + cost_lake + "$");
		System.out.println("Bridgewood : " + cost_bridge + "$");
		System.out.println("Ridgewood : " + cost_ridge + "$");
		// printing hotel with chepeast price
		String result = min(cost_lake, cost_bridge, cost_ridge);
		int result1 = minrating(cost_lake, cost_bridge, cost_ridge);
		int result2 = totalPrice(cost_lake, cost_bridge, cost_ridge);
		System.out
				.println("Cheapest price is of Hotel is " + result + ", Ratings " + result1 + ", TotalPric " + result2);
	}

	private static int totalPrice(int a, int b, int c) {
		if (a < c && a < b) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else if (a == b) {
			return b;
		}
		else if (b == c) {
			return c;
		}
		else if (a == c) {
			return a;
		}
		else {
			return c;
		}
	}

	// implementing the min method to find hotel with cheapest price
	public static String min(int a, int b, int c) {
		if (a < c && a < b) {
			return lake.getHotelName();
		} else if (b < a && b < c) {
			return bridge.getHotelName();
		} else if (a == b) {
			return (bridge.getHotelName());
		} else if (b == c) {
			return (ridge.getHotelName());
		} else if (a == c) {
			return (lake.getHotelName());
		} else {
			return ridge.getHotelName();
		}
	}

	// method to find hotel with minimum rating
	public static Integer minrating(int a, int b, int c) {
		if (a < b && a < c) {
			return (lake.getRating());
		} else if (b < a && b < c) {
			return (bridge.getRating());
		} else if (a == b) {
			return (bridge.getRating());
		} else if (b == c) {
			return (ridge.getRating());
		} else if (a == c) {
			return (lake.getRating());
		} else {
			return (ridge.getRating());
		}
	}

}
