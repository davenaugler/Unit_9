package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

import java.util.HashMap;
import java.util.Map;

public class PokerGameFlushApp {
	
	static Map<String, Integer> flushes = new HashMap<>();

	public static void main(String[] args) {
		Map<String, Integer> flushes = extractDataFromCSV("PokerHands.csv");
//		for (String player : hands.values()) {
//			System.out.println(player.toString());
//		}
//		printToConsole(hands);
		
	}
	
	private static Map<String, Integer> extractDataFromCSV(String fileName) {
		FileService fileService = new FileService();
		return fileService.readFile(fileName);
	}
	
	private static void printToConsole(Map<String, Integer> hands) {
		System.out.println(hands.get(hands));
		
//		for (String hand : hands) {
//			System.out.println(hand);
//		}
	}

}
