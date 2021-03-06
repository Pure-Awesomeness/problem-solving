package com.practice.problems.grokking.educative.slidingwindow.impl.jan;

import com.practice.problems.grokking.educative.slidingwindow.NoRepeatSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:

Input: String="aabccbb"
Output: 3
Explanation: The longest substring with distinct characters is "abc".
Example 2:

Input: String="abbbb"
Output: 2
Explanation: The longest substring with distinct characters is "ab".
Example 3:

Input: String="abccde"
Output: 3
Explanation: Longest substrings with distinct characters are "abc" & "cde".
 * @author SKJ-PC
 *
 */
public class NoRepeatSubstringJana implements NoRepeatSubstring {

	@Override
	public int findLength(String str) {
		int maxCnt = 0;
		int count = 0;
		int windowStart = 0;
		Map<Character, Integer> characterMap = new HashMap<>();
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			Character character = str.charAt(windowEnd);
			
			while(characterMap.containsKey(character)) {
				count = windowEnd - windowStart;
				maxCnt = Math.max(maxCnt, count);
				characterMap.remove(str.charAt(windowStart));
				windowStart++;
			}
			characterMap.put(character, 1);
			
		}
		return maxCnt;
	}
}
