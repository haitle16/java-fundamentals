package inheritance;

public class Restaurant {
    // 3 variables: restaurant name, rating from 0-5, and price category
    String name;
    int rating;
    String priceCat;

    public Restaurant( String name, int rating, String priceCat){
        this.name = name;
        this.rating = rating;
        this.priceCat = priceCat;

    }

    public String toString(){
        return "Restaurant name: "+ this.name +" | Rating: "+ this.rating + " | Price Category " + this.priceCat;
    }

}
