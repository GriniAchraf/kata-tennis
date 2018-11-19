public class Player {

	private String name;
	private int scoreGame;
	private int scoreSet;
	private boolean itsDeuce;
	private boolean hasAdvantage;

	public Player(String name) {
		this.name = name;
		this.scoreGame = 0;
		this.scoreSet = 0;
		this.itsDeuce = false;
		this.hasAdvantage = false;
	}

	public int getScoreGame() {
		return scoreGame;
	}

	public void setScoreGame(int scoreGame) {
		this.scoreGame = scoreGame;
	}

	public boolean isItsDeuce() {
		return itsDeuce;
	}

	public void setItsDeuce(boolean itsDeuce) {
		this.itsDeuce = itsDeuce;
	}

	public boolean isHasAdvantage() {
		return hasAdvantage;
	}

	public void setHasAdvantage(boolean hasAdvantage) {
		this.hasAdvantage = hasAdvantage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScoreSet(int scoreSet) {
		this.scoreSet = scoreSet;
	}

	public String getName() {
		return this.name;
	}

	public void winPoint(Player vsPlayer) {
		switch (scoreGame) {
		case 0:
			scoreGame = 15;
			break;
		case 15:
			scoreGame = 30;
			break;
		case 30:
			scoreGame = 40;
			break;
		case 40:
			if (vsPlayer.getScoreGame() == 40 && !hasAdvantage) {
				if (vsPlayer.isHasAdvantage()) {
					itsDeuce = true;
					vsPlayer.setItsDeuce(true);
					vsPlayer.setHasAdvantage(false);
				} else {
					hasAdvantage = true;
					itsDeuce = false;
					vsPlayer.setItsDeuce(false);
				}
			} else {
				winGame();

			}
			break;
		default:
			break;
		}
		System.out.println(name + ": Wins 1 Point !!");
	}

	public void winGame() {
		scoreSet++;
	}

	public int getScoreSet() {
		return this.scoreSet;
	}

	public void resetScoreGame() {
		scoreGame = 0;
		itsDeuce = false;
		hasAdvantage = false;
	}

	public void showScore() {
		if (itsDeuce)
			System.out.println(name + ":  " + "DEUCE" + "         " + scoreSet);
		else {
			if (hasAdvantage)
				System.out.println(name + ":  " + "ADV" + "         "
						+ scoreSet);
			else
				System.out.println(name + ":  " + scoreGame + "         "
						+ scoreSet);
		}
	}
}
