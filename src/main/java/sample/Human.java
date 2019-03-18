package sample;

import java.util.ArrayList;

/**
 * Class Man
 */
class Human {

    /** Person's name*/
    private String name;

    /**
     * Default constructor
     */
    Human() {
        name = "";
    }

    /**
     * Constructor with parameters
     * @param name person's name
     */
    Human (String name) {
        this.name = name;
    }

    /**
     * Man name setter
     * @param name  person's name
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * @return person's name
     */
    String getName() {
        return name;
    }

    /**
     * The method of "food". Removes a dish from the list
     * @param foods food list
     * @return food
     */
    Food eat(ArrayList<Food> foods) {
        /*Food f = foods.get(foods.size()-1);
        foods.remove(foods.size()-1);
        return f;*/
        return foods.remove(foods.size() - 1);
    }
}
