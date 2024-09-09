import java.util.ArrayList;

/**
 * The Hat class is a decorator for the Character class that adds a hat to a character.
 * 
 * @author Yatin Raju
 */
public class Hat extends CharacterDecorator {

    /**
     * Constructs a new Hat decorator by adding a hat to the specified character.
     * 
     * @param character the character to be decorated with a hat
     */
    public Hat(Character character) {
        super(character);
        ArrayList<String> hat = FileReader.getLines("decorator/text/hat.txt");
        integrateDecor(hat, 0);  // Adjust the offset if needed for better alignment
    }

    /**
     * Returns the string representation of the character with a hat added.
     * 
     * @return the ASCII art representation of the character with a hat
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
