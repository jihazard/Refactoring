package chapter1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    public Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public int addRental(Rental arg) {
        _rentals.addElement(arg);
        return _rentals.size();
    }

    public String get_name() {
        return _name;
    }


    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoint = 0;
        Enumeration rentals = _rentals.elements();
        String result = get_name() +"님 기록 \n";
        while(rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = each.getCharge();

            //적립포인트
            frequentRenterPoint ++;

            if((each.get_movie().get_priceCode() == Movie.NEW_RELEASE) &&
                each.get_dayRented() > 1) frequentRenterPoint ++;

            result += each.get_movie().get_title() +"/"+thisAmount;

            totalAmount += thisAmount;

            result += "point:"+totalAmount+"/memberPoint:" + frequentRenterPoint +"\n";

        }
        return result;
    }

}
