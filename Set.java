public class Set {

	private Player player1;
	private Player player2;

	public Set(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		System.out.println("--The set starts");
		Player winner = null;

		while (player1.getScoreSet() < 6 && player2.getScoreSet() < 6) {
			new Game(player1, player2).play();
		}

		// Tie break
		while (Math.abs(player1.getScoreSet() - player2.getScoreSet()) < 2) {
			new Game(player1, player2).play();
		}

		winner = player1.getScoreSet() > player2.getScoreSet() ? player1
				: player2;

		System.out.println("================================="
				+ winner.getName() + "  wins this Set!! ====================");
		showSetScore();

	}

	public void showSetScore() {
		System.out.println("-------- FINAL SCORE");
		System.out.println("Player:          ScoreSet");
		System.out.println(player1.getName() + ":           "
				+ player1.getScoreSet());
		System.out.println(player1.getName() + ":           "
				+ player2.getScoreSet());
	}

}
