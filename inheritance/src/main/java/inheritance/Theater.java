package inheritance;

import java.util.List;

public class Theater {
    List<Review> reviews;
    String name;
    String movies;

    public Theater(String name, String movies){
        this.name = name;
        this.movies = movies;
    }

    public void addMovie(String movieName){
        this.movies += movieName +" ";
    }

    public void removeMovie(String movieName){
        if(this.movies.contains(movieName)){
            this.movies = this.movies.replace(movieName, "");
        }
    }

    public String toString(){
        return "Theater: " + this.name + " | Currently showing: " + this.movies;
    }
}
