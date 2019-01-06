package chapter1;

abstract class Price {
    abstract  double getPriceCode(int daysRented);
    abstract double getCharge(int daysRented);
    abstract int getFrequentrenterPoint(int daysRented);
}
