/**
 * The Hard class implements the State interface and provides functionality for hard difficulty.
 * Numbers range from 1-50, and addition, subtraction, multiplication, and division operations are available.
 * 
 * @author Yatin Raju
 */
public class Hard implements State {
    private ArithemeticGame game;

    /**
     * Constructor for the Hard state.
     * 
     * @param game The ArithemeticGame instance.
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number between 1 and 50.
     * 
     * @return A random number between 1 and 50.
     */
    public int getNum() {
        return (int) (Math.random() * 50) + 1;
    }

    /**
     * Selects an operation: addition, subtraction, multiplication, or division.
     * 
     * @return The selected Operation (+, -, *, or /).
     */
    public Operation getOperation() {
        double chance = Math.random();
        if (chance < 0.25) {
            return Operation.PLUS;
        } else if (chance < 0.50) {
            return Operation.MINUS;
        } else if (chance < 0.75) {
            return Operation.MULTIPLY;
        } else {
            return Operation.DIVIDE;
        }
    }

    /**
     * Does nothing, as Hard is the highest difficulty.
     */
    public void increaseDifficulty() {
        // Already at the hardest level
    }

    /**
     * Decreases the difficulty level to medium.
     */
    public void decreaseDifficulty() {
        game.setState(game.getMediumState());
    }
}
