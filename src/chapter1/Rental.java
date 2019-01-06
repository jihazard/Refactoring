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
        return _movie.getCharge(_dayRented);
    }

    public int getFrequentRenterPoint() {
        return _movie.getFrequentRenterPoint(_dayRented);
    }
}
