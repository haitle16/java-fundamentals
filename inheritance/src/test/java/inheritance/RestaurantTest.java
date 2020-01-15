package inheritance;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant restaurant;

    @Before
    public void setUp() throws Exception {
        restaurant = new Restaurant("McDonald", 4.0, "$");
        restaurant.addReview(new Review(5.0, "This restaurant cleanliness is exceptional", "Andrew Barrs"));
    }

    @Test
    public void testRestaurantConstructor(){
        assertEquals("McDonald", restaurant.name);
        assertEquals(4.0, restaurant.rating, 0.0);
        assertEquals("$", restaurant.priceCat);
        restaurant.toString();
        System.out.println(restaurant);
    }

    @Test
    public void toStringMethodTest(){
        String expected = "Restaurant name: McDonald | Rating: 4.0 | Price Category $";
        assertEquals(expected, restaurant.toString());
    }

    @Test
    public void addReviewTest(){
        String expected = "[received 5.0 stars| text: This restaurant cleanliness is exceptional| author: Andrew Barrs]";
        assertEquals(expected, restaurant.reviews.toString());
    }

    @Test
    public void restaurantLengthTest(){
        restaurant.addReview(new Review(4.0, "This restaurant cleanliness is exceptional", "Cait Rubin"));
        assertEquals(2, restaurant.reviews.size());
    }

}
