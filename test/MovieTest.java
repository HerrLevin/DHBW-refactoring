import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {
    private String title;
    private int priceCode;
    private Movie testmovie;

    @BeforeEach
    void setUp() {
        title = "Testmovie";
        priceCode = 1;
        testmovie = new Movie(title, priceCode);
    }

    @Test
    void getTitle() {
        assertEquals("Testmovie", testmovie.getTitle());
    }
}