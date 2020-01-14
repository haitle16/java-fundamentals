package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant restaurant;

    @Before
    public void setUp() throws Exception {
        restaurant = new Restaurant("McDonald", 4, "$");
    }

    @Test
    public void testRestaurantConstructor(){
        assertEquals("McDonald", restaurant.name);
        assertEquals(4, restaurant.rating);
        assertEquals("$", restaurant.priceCat);
        restaurant.toString();
        System.out.println(restaurant);
    }

    @Test
    public void toStringMethodTest(){
        String expected = "Restaurant name: McDonald | Rating: 4 | Price Category $";
        assertEquals(expected, restaurant.toString());
    }
}
