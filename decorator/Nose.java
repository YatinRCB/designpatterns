import java.util.ArrayList;

/**
 * The Nose class is a decorator for the Character class that adds a nose to a character.
 * 
 * @author Yatin Raju
 */
public class Nose extends CharacterDecorator {

    /**
     * Constructs a new Nose decorator by adding a nose to the specified character.
     * 
     * @param character the character to be decorated with a nose
     */
    public Nose(Character character) {
        super(character);
        ArrayList<String> nose = FileReader.getLines("decorator/text/nose.txt");
        integrateDecor(nose, -2);  // Providing a slight negative offset to center the nose better
    }

    /**
     * Returns the string representation of the character with a nose added.
     * 
     * @return the ASCII art representation of the character with a nose
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
