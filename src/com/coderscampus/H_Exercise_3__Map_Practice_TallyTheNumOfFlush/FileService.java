package com.coderscampus.H_Exercise_3__Map_Practice_TallyTheNumOfFlush;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileService {
	// Map is about Key Value pairs. In this case the String is the Key and the Integer is the Value
	// Key = playerName
	// Value = # of Flush's

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
				String playerName = cardInfo[0];
				String hand = cardInfo[1];

				if ("FLUSH".equals(hand)) {
					if (flushTally.containsKey(playerName)) {
						int currentFlushes = flushTally.get(playerName);
						flushTally.put(playerName, currentFlushes + 1);
					} else {
						flushTally.put(playerName, 1);
					}
				}

			}
			// Do I need line 57? Come back to and figure that out. - 7/27/2023
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return flushTally;
	}
}
