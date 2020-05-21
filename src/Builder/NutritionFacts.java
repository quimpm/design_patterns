package Builder;

import java.util.Objects;

public class NutritionFacts {

    private final int servingSize; // (mL)    required
    private final int servings;    // (units) required
    private final int calories;    //         optional
    private final int fat;         // (g)     optional
    private final int sodium;      // (mg)  optional
    private final int carbohydrate;// (g)     optional

    public NutritionFacts(int servingSize, int servings){
        this(servingSize,servings,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories){
        this(servingSize,servings,calories,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat){
        this(servingSize,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium){
        this(servingSize,servings,calories,fat,sodium,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate){
        this.servingSize=servingSize;
        this.servings=servings;
        this.calories=calories;
        this.fat=fat;
        this.sodium=sodium;
        this.carbohydrate=carbohydrate;
    }

    public static class Builder {
        private final int servingSize; // (mL)    required
        private final int servings;    // (units) required

        private int calories = 0;    //         optional
        private int fat = 0;         // (g)     optional
        private int sodium = 0;      // (mg)  optional
        private int carbohydrate = 0;// (g)     optional

        public Builder(int servingSize, int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this.servingSize,
                                        this.servings,
                                        this.calories,
                                        this.fat,
                                        this.sodium,
                                        this.carbohydrate);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NutritionFacts that = (NutritionFacts) o;
        return servingSize == that.servingSize &&
                servings == that.servings &&
                calories == that.calories &&
                fat == that.fat &&
                sodium == that.sodium &&
                carbohydrate == that.carbohydrate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(servingSize, servings, calories, fat, sodium, carbohydrate);
    }
}
