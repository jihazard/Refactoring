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

        int frequentRenterPoint = 0;
        Enumeration rentals = _rentals.elements();
        String result = get_name() + "님 기록 \n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.get_movie().get_title() + "/" + each.getCharge();
            result += "point:" + getTotalCharge() + "/memberPoint:" + getfrequentRentPoint() + "\n";

        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    private double getfrequentRentPoint() {
        double result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoint();
        }
        return result;
    }



}