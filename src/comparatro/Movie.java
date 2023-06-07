package comparatro;

public class Movie {

    public String titel;
    public  int month ;

    public double rating;

    public Movie(String t,int m,double r) {
        super();
        this.rating=r;
        this.month=m;
        this.titel=t;

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titel='" + titel + '\'' +
                ", month=" + month +
                ", rating=" + rating +
                '}';
    }
}
