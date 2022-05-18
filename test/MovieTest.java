import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    private Movie testMovie= new Movie("Pokemon", 5);

    @Test
    public void testGetMovie(){
        assertEquals("Pokemon",testMovie.getTitle());
    }

    @Test
    public void testGetPriceCode(){
        assertEquals(5, testMovie.getPriceCode());
    }

    @Test
    public void testSetPriceCode(){
        testMovie.setPriceCode(20);
        assertEquals(20, testMovie.getPriceCode());
    }

}
