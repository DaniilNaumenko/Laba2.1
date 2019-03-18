package sample;

/**
 * Klass food
 */
class Food extends Item {

    private Taste taste;

    /**
     * Constructor with parameters
     */
    Food(String ItemName) {
        super(ItemName);
        this.taste = Taste.TASTELESS;
    }

    /**
     *Constructor with parameters
     */
    Food(Taste taste, String ItemName){
        super(ItemName);
        this.taste = taste;
    }


    Taste getTaste() {
        return taste;
    }

    /**
     * @return a string equivalent to the taste of the dish
     */
    String tasteToString() {
        switch (taste)
        {
            case SWEET: return "Sweet";
            case SOUR: return "Sour";
            case SALTY: return "Сalt";
            case BITTER: return "Bitter";
        }
        return "Tasteless";
    }
}
