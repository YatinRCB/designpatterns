/**
 * The Easy class implements the State interface and provides functionality for easy difficulty.
 * Numbers range from 1-10, and only addition and subtraction operations are available.
 * 
 * @author Yatin Raju
 */
public class Easy implements State {
    private ArithemeticGame game;

    /**
     * Constructor for the Easy state.
     * 
     * @param game The ArithemeticGame instance.
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * Generates a random number between 1 and 10.
     * 
     * @return A random number between 1 and 10.
     */
    public int getNum() {
        return (int) (Math.random() * 10) + 1;
    }

    /**
     * Selects either the addition or subtraction operation.
     * 
     * @return The selected Operation (+ or -).
     */
    public Operation getOperation() {
        return Math.random() > 0.5 ? Operation.PLUS : Operation.MINUS;
    }

    /**
     * Increases the difficulty level to medium.
     */
    public void increaseDifficulty() {
        game.setState(game.getMediumState());
    }

    /**
     * Does nothing, as Easy is the lowest difficulty.
     */
    public void decreaseDifficulty() {
        // Already at the easiest level
    }
}
