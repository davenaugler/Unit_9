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
	public Map<Player, String> readFile1(String fileName) {
		Map<Player, String> hand = new HashMap<>();
		boolean isFirstLine = true;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue;
				}
				
				String[] playerInfo = line.split(",");
				
				String player = playerInfo[0];
				String winningHand = playerInfo[1];
				
				Player player1 = new Player(player1, winningHand);
				
				System.out.println(playerInfo);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hand;
		
	}
	

	
}
