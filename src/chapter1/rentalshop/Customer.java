package chapter1.rentalshop;

import java.util.*;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental rental){
        _rentals.add(rental);
    }

    public String get_name() {
        return _name;
    }


    public String statement() {
        double totalAmount = 0;
        int frequentRentalPoint = 0;

        Enumeration rentals = _rentals.elements();
        String result = get_name() +" 고객님의 대여기록 " +
                "\n";

        while(rentals.hasMoreElements()){

            Rental each = (Rental)rentals.nextElement();



            frequentRentalPoint ++;

            if((each.get_movie().get_priceCode()==Movie.NEW_RELEASE) && each.get_daysRental() > 1 ) frequentRentalPoint ++;

            result += "\t " + each.get_movie().get_title() +"\t" + String.valueOf(each.getCharge()) + "\n";

            totalAmount += each.getCharge();


        }
        result += "누적 대여료 : " + String .valueOf(totalAmount) +"\n";
        result += "적립 포인트 : " + String .valueOf(frequentRentalPoint) +"\n";
        return result;

    }

}
