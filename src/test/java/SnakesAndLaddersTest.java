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

}
