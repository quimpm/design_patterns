package Builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NutritionFactsBuilderTest {

    NutritionFacts constructor;
    NutritionFacts builder;

    @BeforeEach
    public void setUp(){
        constructor = new NutritionFacts(240, 8, 100, 35, 27, 34);
        builder = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .fat(35)
                .sodium(27)
                .carbohydrate(34)
                .build();
    }

    @Test
    public void sameObjectTest(){
        assertEquals(constructor,builder);
    }

}
