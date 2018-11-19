import java.util.Random;

public class Game {

	private Player player1;
	private Player player2;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.player1.resetScoreGame();
		this.player2.resetScoreGame();
	}

	public void play() {
		System.out.println("==The game starts");
		int scoreSetP1 = player1.getScoreSet();
		int scoreSetP2 = player2.getScoreSet();
		Player winner = null;
		Random r = new Random();
		int k = 0;
		while (scoreSetP1 == player1.getScoreSet()
				&& scoreSetP2 == player2.getScoreSet()) {
			k = r.nextInt(11);
			System.out.println("****************************");
			showGameScore();
			if (k % 2 == 0) {
				player1.winPoint(player2);

			} else {

				player2.winPoint(player1);

			}

		}
		if (player1.getScoreSet() != scoreSetP1)
			winner = player1;
		else
			winner = player2;

		System.out.println("----------------------------------"
				+ winner.getName() + "  wins this game!! -------------------");

	}

	public void showGameScore() {

		System.out.println("Player:        ScoreGame  ScoreSet");
		player1.showScore();
		player2.showScore();
	}

}
