package chapter1;

public class ChildrenPrice extends Price{
    @Override
    double getPriceCode(int daysRented) {
         return Movie.CHILDREN;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if(daysRented > 3) {
            result += (daysRented - 3) *1.5;
        }
        return result;
    }

    @Override
    int getFrequentrenterPoint(int daysRented) {
        return (daysRented > 1) ? 2:1 ;
    }
}
