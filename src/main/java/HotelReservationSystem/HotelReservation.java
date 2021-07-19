package HotelReservationSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelReservation {
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";
	
	public boolean validateName(String hotelName) {
        return patternChecker(hotelName, NAME_PATTERN);
    }
	 private boolean patternChecker(String input,String fieldPattern) {
	        Pattern pattern = Pattern.compile(fieldPattern);
	        Matcher matcher = pattern.matcher(input);
	        boolean result = matcher.matches();
	        return result;
	    }

}
