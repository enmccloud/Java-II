/**
 * Game Class
 * @author Nikki McCloud
 * @version 1.0
 */
package dmacc.beans;
import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	
	private String player1;
	private String computerPlayer;
	private String winner;


	/**
	 * Game Constructor
	 * @param player1
	 */
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	/**
	 * Determine Winner Method
	 * @param computerPlayer
	 * @param player1
	 * @param winner
	 * @return winner
	 */
	private void determineWinner() {
		// TODO Auto-generated method stub
	
		if(player1.equalsIgnoreCase("rock")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "Game Tie!";
				
			}else if(computerPlayer.equals("paper")) {
				winner = "You have lost. Please try again!";
				
			}else if(computerPlayer.equals("scissors")) {
				winner = "Congratulations! You Won!";
				
			}else if(computerPlayer.equals("lizard")) { 
				winner = "Congratulations! You Won!";
			
			}else {
				winner = "You have lost. Please try again!";
			}
			
		}else if(player1.equalsIgnoreCase("paper")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "Congratulations! You Won!";
			
			}else if(computerPlayer.equals("paper")) {
				winner = "Game Tie!";
				
			}else if(computerPlayer.equals("scissors")) {
				winner = "You have lost. Please try again!";
				
			}else if(computerPlayer.equals("lizard")) { 
				winner = "Congratulations! You Won!";
			
			}else {
				winner = "You have lost. Please try again!";
			}
		
		}else if(player1.equalsIgnoreCase("scissors")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "You have lost. Please try again!";
			
			}else if(computerPlayer.equals("paper")) {
				winner = "Congratulations! You Won!";
				
			}else if(computerPlayer.equals("scissors")) {
				winner = "Game Tie!";
			
			}else if(computerPlayer.equals("lizard")) { 
				winner = "Congratulations! You Won!";
			
			}else {
				winner = "You have lost. Please try again!";
			}
			
		}else if(player1.equalsIgnoreCase("lizard")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "You have lost. Please try again!";
			
			}else if(computerPlayer.equals("paper")) {
				winner = "Congratulations! You Won!";
				
			}else if(computerPlayer.equals("scissors")) {
				winner = "You have lost. Please try again!";
			
			}else if(computerPlayer.equals("lizard")) { 
				winner = "Game Tie!";
				
			}else {
				winner = "Congratulations! You Won!";
			}
		
		}else if(player1.equalsIgnoreCase("spock")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "Congratulations! You Won!";
			
			}else if(computerPlayer.equals("paper")) {
				winner = "You have lost. Please try again!";
				
			}else if(computerPlayer.equals("scissors")) {
				winner = "Congratulations! You Won!";
			
			}else if(computerPlayer.equals("lizard")) { 
				winner = "You have lost. Please try again!";
				
			}else {
				winner = "Game Tie!";
			}
		}
	}


	/**
	 * Randomized Computer Selection
	 * @param computerPlayer
	 * @return random player selection
	 */
	private void setComputerPlayerToRandom() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNumber = random.nextInt(5) + 1;
		
		switch(randomNumber) {
		case 1: computerPlayer = "rock";
		break; 
		case 2: computerPlayer = "paper";
		break;
		case 3: computerPlayer = "scissors";
		break;
		case 4: computerPlayer = "lizard";
		break;
		case 5: computerPlayer = "spock";
		break;
		}
	}
}