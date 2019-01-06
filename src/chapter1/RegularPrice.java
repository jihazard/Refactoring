package chapter1;

public class RegularPrice extends Price {
    @Override
    double getPriceCode(int daysRented) {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if(daysRented > 2)
            result += (daysRented - 2 ) * 1.5;
        return result;
    }

    @Override
    int getFrequentrenterPoint(int daysRented) {
        return (daysRented > 1) ? 2:1 ;
    }
}
