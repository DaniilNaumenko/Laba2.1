package sample;

import java.util.ArrayList;
import java.util.Random;

/**
 * Klass Cook
 */
class Cook extends Human {

    /**
     * Default constructor
     */
    Cook () {
        super();
    }

    /**
     * Constructor with parameters
     * @param name
     */
    Cook (String name) {
        super (name);
    }

    /**
     * Cook's "cooking" method, adds a new "Food" object to the general list
     * @param foodArrayList Food list
     * @param ItemName food titles
     */
    void cook(ArrayList<Food> foodArrayList, String ItemName) {
        Random rand = new Random();
        int r = rand.nextInt(4);
        Taste t = null;
        switch (r)
        {
            case 0: t = Taste.SWEET; break;
            case 1: t = Taste.SOUR; break;
            case 2: t = Taste.SALTY; break;
            case 3: t = Taste.BITTER; break;
        }
        Food f = new Food(t, ItemName);
        foodArrayList.add(foodArrayList.size(), f);
    }
}
