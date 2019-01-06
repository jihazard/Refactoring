package chapter1;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private Price price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
       set_priceCode(_priceCode);
    }

    public String get_title() {
        return _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int arg) {
       switch (arg){
           case REGULAR:
               price = new RegularPrice();
               break;
           case CHILDREN:
               price = new ChildrenPrice();
               break;
           case NEW_RELEASE:
               price = new NewReleasePrice();
               break;
               default:
                   throw new IllegalArgumentException("가격 코드가 잘못됐스니다.");
       }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoint(int daysRented) {
        return price.getFrequentrenterPoint(daysRented);
    }

}
