package chapter1;

public class Rental {
    private Movie _movie;
    private int _dayRented;

    public Rental(Movie _movie, int _dayRented) {
        this._movie = _movie;
        this._dayRented = _dayRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_dayRented() {
        return _dayRented;
    }

    public double getCharge() {

        double result = 0;
        switch (get_movie().get_priceCode()){
            case Movie.REGULAR:
                result += 2;
                if(get_dayRented() > 2)
                    result += (get_dayRented() - 2 ) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += get_dayRented() * 3;
                break;
            case Movie.CHILDREN :
                result += 1.5;
                if(get_dayRented() > 3) {
                    result += (get_dayRented() - 3) *1.5;
                }
                break;
        }
        return result;
    }
}
