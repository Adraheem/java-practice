package classwork.chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportRecommenderTest {
    @Test
    void testLovelyWeather(){
        SportRecommender recommender = new SportRecommender(25);
        assertNotNull(recommender);

        assertEquals("It’s lovely weather for sports today!", recommender.recommend());
    }

    @Test
    void testReasonableWeather(){
        SportRecommender recommender = new SportRecommender(10);
        assertNotNull(recommender);

        assertEquals("It’s reasonable weather for sports today.", recommender.recommend());
    }

    @Test
    void testOtherTemperature(){
        SportRecommender recommender = new SportRecommender(5);
        assertNotNull(recommender);

        assertEquals("Please exercise with care today, watch out for the weather!", recommender.recommend());
    }
}