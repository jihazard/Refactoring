package chapter1.rentalshop;

public class Rental {
    private Movie _movie;
    private int _daysRental;

    public Rental(Movie _movie, int _daysRental) {
        this._movie = _movie;
        this._daysRental = _daysRental;
    }

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRental() {
        return _daysRental;
    }

    public void set_daysRental(int _daysRental) {
        this._daysRental = _daysRental;
    }

    public double getCharge() {
        int result = 0;
        //비디오 종류별 대여료 계산
        switch (get_movie().get_priceCode()){
            case Movie.REGULAR :
                result += 2;
                if(get_daysRental() > 2) result += (get_daysRental()-2) * 1.5;
                break;

            case Movie.NEW_RELEASE :
                result += get_daysRental() *3;
                break;

            case Movie.CHILDRENS :
                result += 1.5;
                if(get_daysRental() >3)
                    result += (get_daysRental()-3) *1.5;
                break;

        }
        return result;
    }
}
