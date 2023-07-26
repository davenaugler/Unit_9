package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileService {
	// Key = playerName
	// Value = # of Flush's
	
	// Keeping comments so that I can come back and revisit how I thought I should have coded
	// out the logic in the FileService originally, vs. how it turned out to be correctly coded out.
	// I want to take time to sit down and step through my logic and take more time to see where
	// I went wrong, and then revisit my course correction. 

	public Map<String, Integer> readFile(String fileName) {
		Map<String, Integer> flushTally = new HashMap<>();
		boolean skipHeader = true;

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (skipHeader) {
					skipHeader = false;
					continue;
				}
				String[] cardInfo = line.split(",");
				String playerName = cardInfo[0].trim();
				String hand = cardInfo[1].trim();
				
				if ("FLUSH".equalsIgnoreCase(hand)) {
					if (flushTally.containsKey(playerName)) {
						int currentFlushes = flushTally.get(playerName);
						flushTally.put(playerName, currentFlushes + 1);
					} else {
						flushTally.put(playerName, 1);
					}
				}
				
//				System.out.println(flushTally);
				

//				Player player = new Player(playerName, hand, numOfFlushes);
//				System.out.println(player.toString());
//					hands.put(playerName, winningHand);
				
//				if(flushTally.equals("FLUSH")) {
//					if (flushTally.containsKey(playerName)) {
//						int currentFlushes = flushTally.get(playerName);
//						flushTally.put(playerName, currentFlushes + 1);
//					} else {
//						flushTally.put(playerName, 1);
//					}
//				}

//				if (winningHand.contentEquals("FLUSH")) {
//					if (hands.containsValue(playerName)) {
//						flushes += 1;
//						numOfFlushes = flushes;
//					} else {
//						hands.put(playerName, winningHand);
//						flushes += 1;
//						player = 
//						numOfFlushes = flushes;
//					}
//				}
//				System.out.println(player);
				

//				}

			}
//			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flushTally;

	}

}
