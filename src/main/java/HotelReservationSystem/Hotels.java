package HotelReservationSystem;

public class Hotels {
	private String hotelName;
	public int weekDay;
	public int weekEnd;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	public int getWeekEnd() {
		return weekEnd;
	}
	public void setWeekEnd(int weekEnd) {
		this.weekEnd = weekEnd;
	}
	public Hotels() {
		// TODO Auto-generated constructor stub
	}
	public Hotels(String hotelName) {
		super();
		this.hotelName = hotelName;
	}

	
	
}
