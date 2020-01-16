package inheritance;

public class Review {
    Restaurant restaurant;
    Shop shop;
    Theater theater;
    double revRating;
    String body;
    String author;
    String movieName;

    public Review(double revRating, String body, String author){
        this.revRating = revRating;
        this.body = body;
        this.author = author;
    }

    public Review(double revRating, String body, String author, String movieName){
        this(revRating,body,author);
        this.movieName = movieName;
    }

    public String toString(){
        if(this.movieName != null){
            return "received "+ this.revRating +" stars"+"| text: "+ this.body +"| author: "+this.author+"| Movie Name: " + this.movieName;
        }else {
            return "received "+ this.revRating +" stars"+"| text: "+ this.body +"| author: "+this.author;
        }
    }
}
