package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

public class Player extends PokerGameFlushApp {
	private String player;
	private String winningHand;

	public Player(String player, String winningHand) {
		this.player = player;
		this.winningHand = winningHand;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getWinningHand() {
		return winningHand;
	}

	public void setWinningHand(String winningHand) {
		this.winningHand = winningHand;
	}

	@Override
	public String toString() {
		return "Player [player=" + player + ", winningHand=" + winningHand + "]";
	}
	
	

}
