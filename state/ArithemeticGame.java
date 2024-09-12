/**
 * The ArithemeticGame class manages the state and score of the game.
 * It transitions between difficulty levels (Easy, Medium, Hard) based on the user's performance.
 * 
 * @author Yatin Raju
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private int wrongAnswers;

    /**
     * Constructor that initializes the game with the easy state and score of 0.
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
        wrongAnswers = 0;
    }

    /**
     * Retrieves the next question from the current state.
     * 
     * @return A Question object.
     */
    public Question getQuestion() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }

    /**
     * Increases the score by 1 and resets wrong answers.
     * Also checks for level-up conditions.
     */
    public void increaseScore() {
        score++;
        wrongAnswers = 0;
        checkLevelUp();
    }

    /**
     * Decreases the score by 1 and increments the wrong answer count.
     * If conditions are met, the difficulty is decreased, or the game exits on easy.
     */
    public void decreaseScore() {
        score--;
        wrongAnswers++;

        if (state == easyState && score == -3) {
            System.out.println("Study harder!!");
            System.exit(0);
        } else if ((state == mediumState || state == hardState) && wrongAnswers == 3) {
            System.out.println("You've gotten 3 wrong, decreasing difficulty.");
            wrongAnswers = 0;
            checkLevelDown();
        }
    }

    /**
     * Checks if the score is high enough to level up and increases the difficulty if needed.
     */
    private void checkLevelUp() {
        if (score == 3 && state == easyState) {
            setState(mediumState);
            System.out.println("Level Increased to: Medium");
        } else if (score == 6 && state == mediumState) {
            setState(hardState);
            System.out.println("Level Increased to: Hard");
        }
    }

    /**
     * Checks if too many wrong answers were given and decreases the difficulty level if needed.
     */
    private void checkLevelDown() {
        if (state == hardState) {
            setState(mediumState);
            System.out.println("Level Decreased to: Medium");
        } else if (state == mediumState) {
            setState(easyState);
            System.out.println("Level Decreased to: Easy");
        }
    }

    /**
     * Sets the current state of the game.
     * 
     * @param state The new state to set.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the easy state instance.
     * 
     * @return The easy state.
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Gets the medium state instance.
     * 
     * @return The medium state.
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Gets the hard state instance.
     * 
     * @return The hard state.
     */
    public State getHardState() {
        return hardState;
    }
}
