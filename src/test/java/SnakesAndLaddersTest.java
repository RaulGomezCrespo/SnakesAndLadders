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
		token = token.movePosition3Spaces(token);
		
		assertEquals(4, token.getPosition());
	}

	@Test
	public void isTokenOnSquare8IfMoves4SpacesWhenTokenIsOnSquare4AfterMoved3Spaces() {
		
		Token token = new Token(1);
		token = token.movePosition3Spaces(token);
		token = token.movePosition4Spaces(token);
		
		assertEquals(8, token.getPosition());
	}
	
	@Test
	public void isGameWonIfMoves3SpacesWhenTokenIsOnSquare97() {
		
		Token token = new Token(97);
		token = token.movePosition3Spaces(token);
		
		assertTrue(token.calculateVictory(token));
	}
	
	@Test
	public void isGameLostIfMoves4SpacesWhenTokenIsOnSquare97() {
		
		Token token = new Token(97);
		token = token.movePosition4Spaces(token);
		
		assertFalse(token.calculateVictory(token));
	}
}
