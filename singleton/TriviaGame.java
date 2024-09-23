package singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * The TriviaGame class implements a singleton trivia game where players answer trivia questions
 * and accumulate scores based on correct or incorrect answers. It ensures that only one instance
 * of the game can exist at any given time.
 * <p>
 * The game fetches questions from an external data source and provides methods for getting random 
 * questions, checking for more questions, and tracking the player's score.
 * </p>
 * <p>
 * Author: Yatin Raju
 * </p>
 */
public class TriviaGame {

    /** The single instance of TriviaGame */
    private static TriviaGame triviaGame;

    /** The player's current score */
    private int score;

    /** The number of games (questions answered) */
    private int numGames;

    /** A Random object used to pick random questions */
    private Random rand;

    /** A list of available trivia questions */
    private ArrayList<Question> questions;

    /**
     * Private constructor for the singleton pattern. Initializes the random object, loads
     * trivia questions, and sets the initial score and game count to 0.
     */
    private TriviaGame() {
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
        score = 0;
        numGames = 0;
    }

    /**
     * Returns the singleton instance of the TriviaGame. If the instance does not exist yet, 
     * it creates one.
     * 
     * @return The single instance of TriviaGame.
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Retrieves a random trivia question from the list of available questions. The question 
     * is removed from the list so it won't be asked again.
     * 
     * @return A random Question object or null if no questions remain.
     */
    public Question getQuestion() {
        if (questions.isEmpty()) {
            return null;
        }
        return questions.remove(rand.nextInt(questions.size()));
    }

    /**
     * Checks if there are more trivia questions available.
     * 
     * @return {@code true} if there are more questions, {@code false} otherwise.
     */
    public boolean hasMoreQuestions() {
        return !questions.isEmpty();
    }

    /**
     * Updates the score when the player wins a round (answers a question correctly).
     * Increments both the score and the number of games played.
     */
    public void winRound() {
        score++;
        numGames++;
    }

    /**
     * Updates the number of games played when the player loses a round 
     * (answers a question incorrectly).
     */
    public void loseRound() {
        numGames++;
    }

    /**
     * Returns the player's current score as a formatted string, indicating how many 
     * correct answers out of the total number of games.
     * 
     * @return A string representing the player's score in the format "You scored X/Y".
     */
    public String getScores() {
        return "You scored " + score + "/" + numGames;
    }
}
