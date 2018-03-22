/**
 * Author: SAHIL SHARMA
 * Created on Mar 14, 2018
 */
package methods;


public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		String playerName;
		int position;
		
		playerName = "John";
		position = calculateHighScorePosition(1500);
		displayHighScorePosition(playerName, position);
		
		playerName = "Jack";
		position = calculateHighScorePosition(900);
		displayHighScorePosition(playerName, position);
		
		playerName = "Andy";
		position = calculateHighScorePosition(400);
		displayHighScorePosition(playerName, position);
		
		playerName = "Paul";
		position = calculateHighScorePosition(50);
		displayHighScorePosition(playerName, position);
		
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {	
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into positon " + position + " on the high score table.");
	}
	
	public static int calculateHighScorePosition(int score) {
		if(score >= 1000)
			return 1;
		else if(score >= 500)
			return 2;
		else if(score >= 100)
			return 3;
		else
			return 4;
	}

}
