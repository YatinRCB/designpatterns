/**
 * The Medium class implements the State interface and provides functionality for medium difficulty.
 * Numbers range from 1-25, and addition, subtraction, and multiplication operations are available.
 * 
 * @author Yatin Raju
 */
public class Medium implements State {
    private ArithemeticGame game;

    /**
     * Constructor for the Medium state.
     * 
     * @param game The ArithemeticGame instance.
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number between 1 and 25.
     * 
     * @return A random number between 1 and 25.
     */
    public int getNum() {
        return (int) (Math.random() * 25) + 1;
    }

    /**
     * Selects an operation: addition, subtraction, or multiplication.
     * 
     * @return The selected Operation (+, -, or *).
     */
    public Operation getOperation() {
        double chance = Math.random();
        if (chance < 0.33) {
            return Operation.PLUS;
        } else if (chance < 0.66) {
            return Operation.MINUS;
        } else {
            return Operation.MULTIPLY;
        }
    }

    /**
     * Increases the difficulty level to hard.
     */
    public void increaseDifficulty() {
        game.setState(game.getHardState());
    }

    /**
     * Decreases the difficulty level to easy.
     */
    public void decreaseDifficulty() {
        game.setState(game.getEasyState());
    }
}
