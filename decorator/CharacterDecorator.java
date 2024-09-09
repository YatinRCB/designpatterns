import java.util.ArrayList;

/**
 * The CharacterDecorator class is an abstract decorator for the Character class.
 * It allows decorations to be added to an existing Character by overlaying additional ASCII art.
 * 
 * @author Yatin Raju
 */
public abstract class CharacterDecorator extends Character {

    /** The character being decorated. */
    protected Character character;

    /**
     * Constructs a new CharacterDecorator by wrapping the specified character.
     * 
     * @param character the character to be decorated
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
        this.character = character;
    }

    /**
     * Overlays the specified decoration (ASCII art) onto the character's existing ASCII art.
     * 
     * @param decor the ASCII art representing the decoration
     * @param offset the horizontal offset for the decoration placement
     */
    protected void integrateDecor(ArrayList<String> decor, int offset) {
        for (int i = 0; i < decor.size(); i++) {
            String originalLine = this.lines.get(i);
            String decorLine = decor.get(i);

            // Calculate the start position where the decoration should be inserted
            int startPosition = (originalLine.length() - decorLine.length()) / 2 + offset;

            // If the original line is shorter than needed, pad it with spaces
            if (originalLine.length() < startPosition + decorLine.length()) {
                originalLine = String.format("%-" + (startPosition + decorLine.length()) + "s", originalLine);
            }

            // Overlay the decoration on top of the original line
            StringBuilder modifiedLine = new StringBuilder(originalLine);
            for (int j = 0; j < decorLine.length(); j++) {
                if (decorLine.charAt(j) != ' ') {  // Only replace non-space characters
                    modifiedLine.setCharAt(startPosition + j, decorLine.charAt(j));
                }
            }

            // Update the line with the modified content
            this.lines.set(i, modifiedLine.toString());
        }
    }

    /**
     * Returns the string representation of the decorated character.
     * 
     * @return the ASCII art representation of the decorated character as a string
     */
    @Override
    public String toString() {
        return character.toString();
    }
}
