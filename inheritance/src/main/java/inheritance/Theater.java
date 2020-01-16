package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Theater {
    List<Review> reviews;
    String name;
    String movies;
    String movieName;
    boolean isStarsAccurate;

    public Theater(String name, String movies){
        reviews = new LinkedList<>();
        this.name = name;
        this.movies = movies;
        this.isStarsAccurate = false;
    }


    public void addMovie(String movieName){
        this.movies += movieName +" ";
    }

    public void removeMovie(String movieName){
        if(this.movies.contains(movieName)){
            this.movies = this.movies.replace(movieName, "");
        }
    }

    public void addReview(Review r){
        this.reviews.add(r);
        r.theater = this;
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

    public String toString(){
        return "Theater: " + this.name + " | Currently showing: " + this.movies;
    }
}
