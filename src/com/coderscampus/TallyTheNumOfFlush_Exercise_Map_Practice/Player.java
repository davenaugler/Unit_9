package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

public class Player extends PokerGameFlushApp {
	private String playerName;
	private String winningHand;
	private Integer numOfFlushes;

	public Player(String playerName, String winningHand, Integer numOfFlushes) {
		this.playerName = playerName;
		this.winningHand = winningHand;
		this.numOfFlushes = numOfFlushes;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayer(String playerName) {
		this.playerName = playerName;
	}
	
	public String getWinningHand() {
		return winningHand;
	}

	public void setWinningHand(String winningHand) {
		this.winningHand = winningHand;
	}
	
	public Integer getNumOfFlushes() {
		return numOfFlushes;
	}

	public void setNumOfFlushes(Integer numOfFlushes) {
		this.numOfFlushes = numOfFlushes;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", numOfFlushes=" + numOfFlushes
				+ "]";
	}

	
	
	

}
