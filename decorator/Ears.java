import java.util.ArrayList;

/**
 * The Ears class is a decorator for the Character class that adds ears to a character.
 * 
 * @author Yatin Raju
 */
public class Ears extends CharacterDecorator {

    /**
     * Constructs a new Ears decorator by adding ears to the specified character.
     * 
     * @param character the character to be decorated with ears
     */
    public Ears(Character character) {
        super(character);
        ArrayList<String> ears = FileReader.getLines("decorator/text/ears.txt");
        integrateDecor(ears, 0);  // Adjust the offset if needed for better alignment
    }

    /**
     * Returns the string representation of the character with ears added.
     * 
     * @return the ASCII art representation of the character with ears
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
