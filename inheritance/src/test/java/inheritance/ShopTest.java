package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    @Before
    public void setUp(){
        shop = new Shop("YesStyle", "Clothing Shop", 2);
        shop.addReview(new Review(4.0, "Shop looks very organized and clean", "Tiffany Larrs"));
    }

    @Test
    public void shopConstructorTest() {
        assertEquals("YesStyle", shop.name);
        assertEquals("Clothing Shop", shop.description);
        assertEquals(2, shop.priceCat);
    }

    @Test
    public void shoptoStringTest(){
        String expected = "Shop name: YesStyle| About Shop:  Clothing Shop| Price category: 2$";
        assertEquals(expected, shop.toString());
    }

    @Test
    public void addReviewTest(){
        String[] expected = {"received 4.0 stars| text: Shop looks very organized and clean| author: Tiffany Larrs"};
        assertEquals(Arrays.toString(expected), shop.reviews.toString());
    }

    @Test
    public void updateRatingTest(){
        shop.addReview(new Review(3.0, "This restaurant cleanliness is exceptional", "Cait Rubin"));
        assertEquals(3.5, shop.updateRatings(), 0.0001);
    }
}

