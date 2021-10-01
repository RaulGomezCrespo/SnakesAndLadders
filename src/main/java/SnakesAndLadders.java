import java.util.Scanner;

public class SnakesAndLadders {

	public static void main(String[] args) {
		startGame();
	}

	@SuppressWarnings("resource")
	public static void startGame() {
		System.out.println("Hello Voxel");
		System.out.println("Do you want start new game?");
		System.out.println("Write Y/N and press enter: ");
		String answer = ""; 
		boolean isGameStart = Boolean.FALSE;
		do {
			Scanner sc = new Scanner(System.in);
			answer = sc.nextLine();
			if(answer.equalsIgnoreCase("y")) {
				System.out.println("Game start in first square of the board.");
				isGameStart = Boolean.TRUE;
			} else if(answer.equalsIgnoreCase("n")) {
				System.out.println("See you later");
			} else {
				System.out.println("Please, write the correct character");
			}
		} while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
		
		if(isGameStart) {
			gamePlay();
		}
	}
	
	@SuppressWarnings("resource")
	public static void gamePlay() {
		Token token = new Token(1);
		Dice dice = new Dice();
		do {
			System.out.println("Press enter for roll dice");
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			int resultOfDice = dice.roll();
			token = token.moveTokenPositionByResultOfDice(token, resultOfDice);
			System.out.println("Your token is in the square: " + token.getPosition());
		} while(token.getPosition() != 100);
		System.out.println("Congratulations you win the game!");
	}
}
