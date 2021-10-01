import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SnakesAndLaddersTest {
	
	@Test
	public void startGame() {
		
		Token token = new Token(1);
		assertEquals(1, token.getPosition());
	}
	
	@Test
	public void isTokenOnSquare4IfMoves3SpacesWhenTokenIsOnSquare1() {
		
		Token token = new Token(1);
		token = token.moveTokenPositionByResultOfDice(token, 3);
		
		assertEquals(4, token.getPosition());
	}

	@Test
	public void isTokenOnSquare8IfMoves4SpacesWhenTokenIsOnSquare4AfterMoved3Spaces() {
		
		Token token = new Token(1);
		token = token.moveTokenPositionByResultOfDice(token, 3);
		token = token.moveTokenPositionByResultOfDice(token, 4);
		
		assertEquals(8, token.getPosition());
	}
	
	@Test
	public void isGameWonIfMoves3SpacesWhenTokenIsOnSquare97() {
		
		Token token = new Token(97);
		token = token.moveTokenPositionByResultOfDice(token, 3);
		
		assertTrue(token.calculateVictory(token));
	}
	
	@Test
	public void isGameLostIfMoves4SpacesWhenTokenIsOnSquare97() {
		
		Token token = new Token(97);
		token = token.moveTokenPositionByResultOfDice(token, 4);
		
		assertFalse(token.calculateVictory(token));
	}
	
	@Test
	public void isTokenPositionMoved4SpacesIfResultOfRollDiceAre4() {
		Token token = new Token(1);
		int resultOfRollDice = 4;
		int initialTokenPosition = token.getPosition();
		 token  = token.moveTokenPositionByResultOfDice(token, resultOfRollDice);
		assertTrue(token.calculateSpacesMoved(initialTokenPosition, token.getPosition()));
		
	}
	
}
