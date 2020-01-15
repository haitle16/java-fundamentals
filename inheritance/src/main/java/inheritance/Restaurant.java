package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Restaurant {
    // 3 variables: restaurant name, rating from 0-5, and price category
    // List that holds the every restaurant's review
    List<Review> reviews;
    String name;
    double rating;
    String priceCat;
//    boolean isStarsAccurate;

    public Restaurant( String name, double rating, String priceCat){
        reviews = new LinkedList<>();
        this.name = name;
        this.rating = rating;
        this.priceCat = priceCat;
//        this.isStarsAccurate = false;

    }

    public String toString(){
        return "Restaurant name: "+ this.name +" | Rating: "+ this.rating + " | Price Category " + this.priceCat;
    }

    public void addReview(Review r){
        this.reviews.add(r);
        r.restaurant = this;
//        this.isStarsAccurate = false;
    }

//    public double updateRatings(){
//        if(!this.isStarsAccurate){
//            int total = 0;
//            for( Review r : this.reviews){
//            total += r.revRating;
//        }
//            this.rating = (double) total / (double) this.reviews.size();
//            this.isStarsAccurate = true;
//
//
//        }
//        return this.rating;
//    }

}
