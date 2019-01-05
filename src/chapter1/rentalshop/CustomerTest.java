package chapter1.rentalshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerTest {


    @Test
    public  void test() {
        Customer customer = new Customer("yjh");
        Movie movie = new Movie("king's man" , Movie.REGULAR);
        Rental rental = new Rental(movie,1);


        assertEquals(rental.getCharge(), 2);


    }
}