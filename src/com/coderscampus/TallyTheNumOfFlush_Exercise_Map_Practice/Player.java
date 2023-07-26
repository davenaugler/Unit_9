package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

public class Player extends PokerGameFlushApp {
	private String playerName;
	private String hand;
	private Integer numOfFlushes;

	public Player(String playerName, String hand, Integer numOfFlushes) {
		this.playerName = playerName;
		this.hand = hand;
		this.numOfFlushes = numOfFlushes;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayer(String playerName) {
		this.playerName = playerName;
	}
	
	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
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
