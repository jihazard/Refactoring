package chapter1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    Customer customer = new Customer("yjh");


    @Test
    public void getFrequentRentalPointNewRelaseTest_(){
        Rental aa = new Rental(new Movie("titan war", Movie.NEW_RELEASE),2);
        int result = aa.getFrequentRenterPoint();

        assertEquals(2,result);
    }

    @Test
    public void getFrequentRentalPointNewRelaseElseTest_(){
        Rental aa = new Rental(new Movie("titan war", Movie.REGULAR),2);
        int result = aa.getFrequentRenterPoint();
        assertEquals(1,result);
    }

    @Test
    public void amountForTestRegular() {

        double result = new Rental(new Movie("dd",Movie.NEW_RELEASE),1).getCharge();
        System.out.println("result : " + result);
        assertEquals(3.0, result);
    }
    @Test
    public void amountForTestChildren() {

        double result = new Rental(new Movie("dd",Movie.CHILDREN),4).getCharge();
        System.out.println("result : " + result);
        assertEquals(3.0, result);
    }

    @Test
    public void amountForTestNewRelease() {

        double result = new Rental(new Movie("dd",Movie.NEW_RELEASE),2).getCharge();
        System.out.println("result : " + result);
        assertEquals(6.0, result);
    }
    @Test
    public void amountForTestNewReleaseEach() {

        double result = new Rental(new Movie("dd",Movie.NEW_RELEASE),2).getCharge();
        System.out.println("result : " + result);
        assertEquals(6.0, result);
    }


    @Test
    public void statement(){
       customer.addRental(new Rental(new Movie("타이타닉",Movie.NEW_RELEASE),1));
        customer.addRental(new Rental(new Movie("타이타닉2",Movie.NEW_RELEASE),2));
        String result = customer.statement();
        System.out.println(result);
        String expected = "yjh님 기록 \n타이타닉/2.0point:4.0/memberPoint:2.0\n"
                                    +"타이타닉2/2.0point:4.0/memberPoint:2.0\n";
        assertEquals(expected ,result);

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