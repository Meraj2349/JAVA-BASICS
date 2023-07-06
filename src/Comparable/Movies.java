package Comparable;

public class Movies implements Comparable {
    private String movie_titel;
    private int  year ;
    private double reting;

    public Movies(String Mo,int yeaar,double reting )
    {
        super();
        this.movie_titel=Mo;
        this.reting=reting;
        this.year=yeaar;
    }

    public String getMovie_titel() {
        return movie_titel;
    }

    public void setMovie_titel(String movie_titel) {
        this.movie_titel = movie_titel;
    }

    public double getReting() {
        return  reting;
    }

    public void setReting(double reting) {
        this.reting = reting;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" + "movie_titel='" + movie_titel + '\'' + ", year=" + year + ", reting=" + reting + '}';
    }



    @Override
    public int compareTo(Object obj) {
        Movies s1=(Movies) obj;
        if (s1.getReting()<this.getReting())
        {
            return 1;
        }
        else {
            return -1;
        }
    }
}
