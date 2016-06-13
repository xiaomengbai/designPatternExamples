public class MealBuilder {

    /* Builder Pattern
       It is described as a method to compose
       modulized components. The builder class
       seems only a composition of examples. I
       can't tell the point of this class. In
       this exmaple, the "Meal" class seems more
       flexible.

       the only point I think is to decompose the
       building process. For simply modifying the
       code.

       But I mean, it is natural to abstract the
       building process if the same object is constructed
       multiple times. A function/routine is
       required. Why a class?
    */

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

/* Demo */
/*
public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
*/
