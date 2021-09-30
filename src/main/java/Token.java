
public class Token {

	private int position;

	public Token(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	private void setPosition(int position) {
		this.position = position;
	}
	
	public Token moveTokenPositionByResultOfDice(Token token, int resultOfDice) {
		int moveToken = resultOfDice;
		int actualTokenPosition = token.getPosition();
		actualTokenPosition += moveToken;
		if(actualTokenPosition <= 100) {
			token.setPosition(actualTokenPosition);
		}
		return token;
	}

	public boolean calculateVictory(Token token) {
		
		return (token.getPosition() == 100) ? Boolean.TRUE : Boolean.FALSE;
	}

	public boolean calculateSpacesMoved(int initialTokenPosition, int actualTokenPosition) {
		if((actualTokenPosition -= initialTokenPosition) == 4) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	

}
