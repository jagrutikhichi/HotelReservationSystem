package HotelReservationSystem;

public class Hotels {
	private String hotelName;
	private int weekDay;
	private int weekEnd;
	private int rating;
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
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
