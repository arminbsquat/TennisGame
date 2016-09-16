
public class TennisGame {
	int player1score = 0; 
	int player2score = 0; 
	boolean gameEnded = false;

	public void checkIfGameFinished() {
		if(player1score >= 4 && player1score >= player2score +2) {
			this.gameEnded = true;
		}
		if(player2score >= 4 && player2score >= player1score +2) {
			this.gameEnded = true;
		}
	}
	
	public void updatePlayer1Score() {
		if (gameEnded) {
			System.out.print("Game has ended");
		} else {
			this.player1score++;
			this.checkIfGameFinished();	
		}
		
	}
	
	public void updatePlayer2Score() {
		if (gameEnded) {
			System.out.print("Game has ended");
		} else {
			this.player2score++;
			this.checkIfGameFinished();	
		}
		
	}
	
	public String getScore() {
		
		if (gameEnded) {
			if (player1score > player2score) {
				return "Player 1 wins";
			}
			else {
				return "Player 2 wins";
			}		
		} else if (player1score >= 4 && player1score == player2score) {
			return "deuce";	
		}
		else if (player1score >= 4 && player1score == player2score + 1) {
			return "Player 1 has advantage";	
		}
		else if (player2score >= 4 && player2score == player1score + 1) {
			return "Player 2 has advantage";
		} else {
			return  player1score + " - " + player2score ;	
		}
	}
	
	public static void main(String[] args) {
		TennisGame tG = new TennisGame();
		
		tG.updatePlayer1Score();
		tG.updatePlayer1Score();
		tG.updatePlayer1Score();
		tG.updatePlayer2Score();
		tG.updatePlayer2Score();
		tG.updatePlayer2Score();
		tG.updatePlayer2Score();
		tG.updatePlayer1Score();
		
		
		
		System.out.println(tG.getScore());
		
		
	}
}
