
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
	
	public Token movePosition3Spaces(Token token) {
		int moveToken = 3;
		int actualTokenPosition = token.getPosition();
		token.setPosition(actualTokenPosition += moveToken);
		return token;
	}
	
	public Token movePosition4Spaces(Token token) {
		int moveToken = 4;
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



}
