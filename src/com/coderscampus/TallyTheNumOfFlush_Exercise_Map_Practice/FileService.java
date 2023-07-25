package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileService {

	// Key = Player Name
	// Value = # of 'Flush's'
	// Does a Royal Flush count towards the count?

	public Map<String, String> readFile(String fileName) {
		Map<String, String> hands = new HashMap<>();
		boolean isFirstLine = true;
		int flushes = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue;
				}

				String[] playerInfo = line.split(",");
//				if (playerInfo.length == 2) {
				String playerName = playerInfo[0].trim();
//					System.out.println(playerName);
				String winningHand = playerInfo[1].trim();
//					System.out.println(winningHand);
				Player player = new Player(playerName, winningHand, flushes);
				System.out.println(player.toString());
//					hands.put(playerName, winningHand);
				if (winningHand.equals("FLUSH")) {
					if (hands.containsKey(playerName)) {
						flushes = flushes + 1;
						
					}
					
				}
				
				
				
				
				
				hands.put(playerName, winningHand);
				

//				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hands;

	}

}
