package HotelReservationSystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	HotelReservation hotelReservation = new HotelReservation();
	
	@Test
	public void givenName_FirstLetterUpperCase_ShouldReturnTrue () {
			boolean result = hotelReservation.validateName("Lakewood");
			Assert.assertTrue(result);
	}
	
	@Test
	public void givenName_WhenLessThanThreeChar_ShouldReturnFalse () {
			boolean result = hotelReservation.validateName("La");
			Assert.assertFalse(result);
	}
	
}
