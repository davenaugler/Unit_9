package com.coderscampus.H_Exercise_3__Map_Practice_TallyTheNumOfFlush;

import java.util.Map;

public class PokerGameFlushApp {

	public static void main(String[] args) {
		Map<String, Integer> flushTally = extractDataFromCSV("PokerHands.csv");
		printToConsole(flushTally);

		updateKey(flushTally, "Rita Repulsa", "Zordon");
		printToConsole(flushTally);

		updateValue(flushTally, "He Man", 1);
		printToConsole(flushTally);

		removePlayer(flushTally, "He Man");
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
	}

	private static void removePlayer(Map<String, Integer> flushTally, String playerName) {
		flushTally.remove(playerName);
	}

}
