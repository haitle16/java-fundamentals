package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    List<Review> reviews;
    String name;
    String description;
    int priceCat;
    boolean isStarsAccurate;

    public Shop(String name, String description, int priceCat){
        reviews = new LinkedList<>();
        this.name = name;
        this.description = description;
        this.priceCat = priceCat;
        this.isStarsAccurate = false;
    }

    public String toString(){
        return "Shop name: " + this.name + "| About Shop:  " + this.description + "| Price category: " + this.priceCat + "$";
    }

    public void addReview(Review r){
        this.reviews.add(r);
        r.shop = this;
        this.isStarsAccurate = false;
    }

    public double updateRatings() {
        double rating = 0;
        if (!this.isStarsAccurate) {
            int total = 0;
            for (Review r : this.reviews) {
                total += r.revRating;
            }
            rating = (double) total / (double) this.reviews.size();
            this.isStarsAccurate = true;
        }
        return rating;
    }

}
