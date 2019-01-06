package chapter1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    Customer customer = new Customer("yjh");


    @Test
    public void statement(){

        customer.addRental(new Rental(new Movie("타이타닉",Movie.NEW_RELEASE),2));
        String result = customer.statement();
        System.out.println(result);

        assertEquals("yjh님 기록 \n타이타닉/6.0point:6.0/memberPoint:2\n" ,result);

    }

    @Test
    public void CustomerGetName() {
        assertEquals("yjh",customer.get_name());
    }

    @Test
    public void addRentalTest(){
        Rental rental = new Rental(new Movie("avengers", Movie.NEW_RELEASE), 2);
        int result = customer.addRental(rental);

        System.out.println("result : " + result);
        assertEquals(1,result);

    }
}