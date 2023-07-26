package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

import java.util.Map;

public class PokerGameFlushApp {

	public static void main(String[] args) {
		Map<String, Integer> flushTally = extractDataFromCSV("PokerHands.csv");
		printToConsole(flushTally);

		updateKey(flushTally, "Rita Repulsa", "Zordon");
		printToConsole(flushTally);
		
		updateValue(flushTally, "He Man", 1);
		printToConsole(flushTally);

	}

	private static Map<String, Integer> extractDataFromCSV(String fileName) {
		FileService fileService = new FileService();
		return fileService.readFile(fileName);
	}

	private static void printToConsole(Map<String, Integer> flushTally) {
		for (Map.Entry<String, Integer> entry : flushTally.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("");
	}

	private static void updateKey(Map<String, Integer> flushTally, String playerName, String newPlayerName) {
		flushTally.put(newPlayerName, flushTally.get(playerName));
		flushTally.remove(playerName);
	}
	
	private static void updateValue(Map<String, Integer> flushTally, String playerName, Integer value) {
		int currentFlushes = flushTally.get(playerName);
		flushTally.put(playerName, currentFlushes + 1);
		
//		flushTally.get(playerName);
//		flushTally.put(playerName, value + value);
	}

}
