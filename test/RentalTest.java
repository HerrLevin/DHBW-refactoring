import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    private Movie testMovie;
    private int daysRented;
    private Rental testRental;

    @BeforeEach
    void setUp() {
        testMovie = new Movie("Testmovie", 1);
        daysRented = 3;
        testRental = new Rental(testMovie, daysRented);
    }

    @Test
    void getDaysRented() {
        assertEquals(3, testRental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertSame(testMovie.getTitle(), testRental.getMovie().getTitle());
        assertTrue(testMovie instanceof Movie);
    }
}