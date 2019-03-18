package sample;

import java.util.Random;
import java.lang.String;

/**
 * Class Programmer
 */
class Programmer extends Human {
    /**The number used for the randomizer number of characters*/
    private static final int RAND_SIZE = 150;
    /** Minimum number of characters*/
    private final int MIN_RAND = 50;
    /** Alphabet Used When Programmer Generates Code*/
    private final String alphabet = ("QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890(){}[]<>=!,");

    /**
     * Default constructor
     */
    Programmer() {
        super ();
    }

    /**
     * Constructor with parameters
     * @param name name)
     */
    Programmer (String name) {
        super(name);
    }

    /**
     * @return character set, which is the "code" written by the Programmer
     */
    String coding(){
        Random rand = new Random();
        int size = rand.nextInt(RAND_SIZE) + MIN_RAND;
        String code = "";
        for (int i=0; i<size; i++)
        {
            char a = alphabet.charAt(rand.nextInt(alphabet.length()));
            code+=a;
        }
        return code;
    }
}
