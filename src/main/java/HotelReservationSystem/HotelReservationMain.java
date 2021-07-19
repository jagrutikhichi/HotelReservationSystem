package HotelReservationSystem;

public class HotelReservationMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		HotelReservationMain system =new HotelReservationMain();
		system.setHotelDetails();
	}
	
	public void setHotelDetails() {
		System.out.println("Hotels and their Prices for Regular Customer \n");
		Hotels hotel = new Hotels();
		
		hotel.setHotelName("LakeWood");
		hotel.setWeekDay(110);
		hotel.setWeekEnd(90);
		System.out.println("HotelName: "+ hotel.getHotelName()+"\n"+"Regular WeekDay Price: "+hotel.getWeekDay()+"\n"+"Regular WeekEnd Price: "+hotel.getWeekEnd()+"\n");
		
		hotel.setHotelName("BridgeWood");
		hotel.setWeekDay(160);
		hotel.setWeekEnd(60);
		System.out.println("HotelName: "+ hotel.getHotelName()+"\n"+"Regular WeekDay Price: "+hotel.getWeekDay()+"\n"+"Regular WeekEnd Price: "+hotel.getWeekEnd()+"\n");
		
		hotel.setHotelName("RidgeWood");
		hotel.setWeekDay(220);
		hotel.setWeekEnd(150);
		System.out.println("HotelName: "+ hotel.getHotelName()+"\n"+"Regular WeekDay Price: "+hotel.getWeekDay()+"\n"+"Regular WeekEnd Price: "+hotel.getWeekEnd()+"\n");
			
	}

}
