import java.util.ArrayList;

/**
 * The Mouth class is a decorator for the Character class that adds a mouth to a character.
 * 
 * @author Yatin Raju
 */
public class Mouth extends CharacterDecorator {

    /**
     * Constructs a new Mouth decorator by adding a mouth to the specified character.
     * 
     * @param character the character to be decorated with a mouth
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> mouth = FileReader.getLines("decorator/text/mouth.txt");
        integrateDecor(mouth, 0);  // Adjust the offset if needed for better alignment
    }

    /**
     * Returns the string representation of the character with a mouth added.
     * 
     * @return the ASCII art representation of the character with a mouth
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
