package chapter1;

public class NewReleasePrice extends Price {
    @Override
    double getPriceCode(int daysRented) {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentrenterPoint(int daysRented) {
        return (daysRented > 1) ? 2:1 ;
    }
}
