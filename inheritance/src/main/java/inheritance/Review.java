package inheritance;

public class Review {
    Restaurant restaurant;
    Shop shop;
    double revRating;
    String body;
    String author;

    public Review(double revRating, String body, String author){
        this.revRating = revRating;
        this.body = body;
        this.author = author;
    }

    public String toString(){
        return "received "+ this.revRating +" stars"+"| text: "+ this.body +"| author: "+this.author+"";
    }
}
