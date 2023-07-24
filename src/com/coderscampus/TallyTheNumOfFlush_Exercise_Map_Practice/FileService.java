package com.coderscampus.TallyTheNumOfFlush_Exercise_Map_Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileService {
	
	// Key = Player Name
	// Value = Winning Hand type. In this case a Flush.
	// Does a Royal Flush count towards the count?
	public Map<Player, String> readFile(String fileName) {
		Map<Player, String> hand = new HashMap<>();
		boolean isFirstLine = true;
//		int columnNumberInCSV = 1;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			// Skips first line on .csv (aka header on .csv)
			while ((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue;
				}
				
				// Split the line by CSV delimiter
				String[] playerInfo = line.split(",");
				String player = playerInfo[0];
				String winningHand = playerInfo[1];
				Player player = new Player(player, winningHand);
				
				
				
//				for (Player )
				System.out.println(valuesInCSV.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return hand;
		
	}
	
	
	
}
