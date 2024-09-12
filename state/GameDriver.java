import java.util.Scanner;
public class GameDriver {
    private Scanner reader;
    private ArithemeticGame game;
    private static final String[] mainOptions = {"Answer a Question", "Quit"};

    public GameDriver() {
        reader = new Scanner(System.in);
        game = new ArithemeticGame();
    }

    public void play() {
        System.out.println("Welcome to our Arithemetic Game");

        while(true) {
            int option = getUserOption();
            
            if(option == 1) {
                playRound();
            } else if(option == 2){
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Sorry Invalid command");
            }
        }
    }

    public void playRound() {
        Question question = game.getQuestion();
        System.out.print(question + ": ");
        int userAnswer =  Integer.parseInt(reader.nextLine());

        if(question.isCorrect(userAnswer)){
            System.out.println("Correct");
            game.increaseScore();
        } else {
            System.out.println("Incorrect");
            game.decreaseScore();
        }   
    }

    private int getUserOption(){
        for(int i=0; i < mainOptions.length; i++){
            System.out.println((i+1) + ". " + mainOptions[i]);
        }
        return Integer.parseInt(reader.nextLine());
    }

    public static void main(String[] args) {
        GameDriver driver = new GameDriver();
        driver.play();
    }
}
