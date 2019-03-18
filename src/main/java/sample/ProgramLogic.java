package sample;

import java.lang.String;
import java.util.ArrayList;

/**
 * Logic Description Class
 */
public class ProgramLogic
{
    private Programmer programmer = new Programmer();
    private Cook cook = new Cook();
    private ArrayList<Food> foodList = new ArrayList<Food>();

    public void cook(String ItemName){
        cook.cook(foodList, ItemName);
    }
    public String coding() {
        return programmer.coding();
    }
    public Food eatProger() {
        return programmer.eat(foodList);
    }
    public Food eatCook() {
        return cook.eat(foodList);
    }
    public ArrayList getArrayList() {
        return foodList;
    }
}
