import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

    private Movie testMovie = new Movie( "Iron Man", 10);
    private Rental testRental = new Rental(testMovie, 25);

    @Test
    public void testGetMovie() {
        assertEquals(testMovie, testRental.getMovie());
    }

    @Test
    public void testGetDaysRented(){
        assertEquals(25, testRental.getDaysRented());
    }
}
