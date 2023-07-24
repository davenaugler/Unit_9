package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

import java.util.Map;

public class PokerGameFlushApp {

	public static void main(String[] args) {
		
		Map<Player, String> hand = extractDataFromCSV("PokerHands.csv");
		
	}
	
	private static Map<Player, String> extractDataFromCSV(String fileName) {
		FileService fileService = new FileService();
		return fileService.readFile(fileName);
	}

}
