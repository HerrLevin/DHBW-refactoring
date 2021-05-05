import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class CustomerTest {

    private Customer customer;
    private String customerName;

    @BeforeEach
    void setUp() {
        customerName = "John";
        customer = new Customer(customerName);
    }

    @org.junit.jupiter.api.Test
    void addRental() {
        Rental rental = new Rental(new Movie("Test movie", 1), 3);
        customer.addRental(rental);
        System.out.println(customer.statement());
        Assertions.assertTrue(customer.statement().contains("for John"));
        Assertions.assertTrue(customer.statement().contains("Test movie\t\t3\t9.0"));
    }

    @Test
    void getName() {
        Assertions.assertEquals("John", customer.getName());

    }

    @org.junit.jupiter.api.Test
    void statement() {
        var movie1 = new Movie("movie1", 1);
        var movie2 = new Movie("movie2", 2);
        var rental1 = new Rental(movie1, 10);
        var rental2 = new Rental(movie2, 5);
        customer.addRental(rental1);
        customer.addRental(rental2);
        Assertions.assertTrue(customer.statement().contains("for John"));
        Assertions.assertTrue(customer.statement().contains("movie1\t\t10\t30.0"));
        Assertions.assertTrue(customer.statement().contains("movie2\t\t5\t4.5"));
        Assertions.assertTrue(customer.statement().contains("Amount owed is 34.5"));
        Assertions.assertTrue(customer.statement().contains("You earned 3 frequent renter points"));

    }
}