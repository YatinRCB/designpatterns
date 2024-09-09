import java.util.ArrayList;

/**
 * The Eyes class is a decorator for the Character class that adds eyes to a character.
 * 
 * @author Yatin Raju
 */
public class Eyes extends CharacterDecorator {

    /**
     * Constructs a new Eyes decorator by adding eyes to the specified character.
     * 
     * @param character the character to be decorated with eyes
     */
    public Eyes(Character character) {
        super(character);
        ArrayList<String> eyes = FileReader.getLines("decorator/text/eyes.txt");
        integrateDecor(eyes, 0);  // Providing an offset of 0 for eyes (adjust if needed)
    }

    /**
     * Returns the string representation of the character with eyes added.
     * 
     * @return the ASCII art representation of the character with eyes
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
