import java.util.ArrayList;

/**
 * The PotatoeHead class is a concrete implementation of the Character class,
 * representing the base version of a Potatoe Head without any decorations.
 * 
 * It initializes the Potatoe Head with the base ASCII art.
 * 
 * @author Yatin Raju
 */
public class PotatoeHead extends Character {

    /**
     * Constructs a new PotatoeHead character with the specified name.
     * The ASCII art for the base Potatoe Head is loaded from a file.
     * 
     * @param name the name of the Potatoe Head character
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("decorator/text/potatoe-head.txt"), name);
    }
}
