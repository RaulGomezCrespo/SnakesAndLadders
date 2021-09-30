import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DiceTest {

	@Test
	public void isResultOfDiceBetween1And6Inclusive() {
		Dice dice = new Dice();
		int resultOfRollDice = dice.roll();
		assertTrue((resultOfRollDice >= 1 && resultOfRollDice <= 6)? Boolean.TRUE: Boolean.FALSE);
	}
	
}
