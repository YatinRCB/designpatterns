import java.util.ArrayList;

/**
 * The Character class represents an ASCII art character.
 * It holds the character's name and its ASCII representation in the form of a list of strings.
 * 
 * @author Yatin Raju
 */
public class Character {
    
    /** The name of the character. */
    private final String name;

    /** The ASCII art representation of the character. */
    protected ArrayList<String> lines;

    /**
     * Constructs a new Character with the specified ASCII art lines and name.
     * 
     * @param lines the ASCII art representation of the character
     * @param name the name of the character
     */
    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    /**
     * Returns the name of the character.
     * 
     * @return the name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the string representation of the character.
     * 
     * @return the ASCII art representation of the character as a string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
