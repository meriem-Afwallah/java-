package hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StringUtil {

	public static int countCharacters(String text) {
		// v1
		// String textWithoutSpaces = text.replace(" ", "");
		// return textWithoutSpaces.length();
		
		// v2
		int charCount = 0;
		for (int i = 0; i < text.length(); i++) {
//			if(text.charAt(i) != ' ') {
			if(! Character.isWhitespace(text.charAt(i))) {
				charCount++;
			}
		}
		
		return charCount;
	}

	public static int countWords(String text) {
		// v1
//		if(text.isEmpty()) {
//			return 0;
//		}
//		
//		int wordsCount = 0;
//		boolean isCharInAWord = false;
//		for (int i = 0; i < text.length(); i++) {
//			
//			if(! isCharInAWord
//			  && text.charAt(i) != ' ') { // debut d'un mot
//				isCharInAWord = true;
//			} else if (isCharInAWord
//					&& text.charAt(i) == ' ') { // fin d'un mot
//				isCharInAWord = false;
//				wordsCount++;
//			}
//			
//		}
//		
//		if(isCharInAWord) {
//			wordsCount++;
//		}
//		return wordsCount;
		
		// v2
		int wordsCount = 0;
		String[] splittedText = text.split(" ");
		for (int i = 0; i < splittedText.length; i++) {
			if(! splittedText[i].isEmpty()) {
				wordsCount++;
			}
		}
		
		return wordsCount;
		
	}

	
	public static boolean isPalindrome(String text) {
		if(text.isEmpty()
		|| text.length() == 1) {
			return false;
		}
		
//		if(text.length() == 1) {
//			return false;
//		}
		
		for (int i = 0; i < text.length() / 2; i++) {
			if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
				return false;
			}
		}
		
		return true;
	}
/*
	public  Map<String, Integer> countWordOccurences(String text) {
		
		HashMap<String, Integer> countOccurences = new HashMap<String, Integer>();
		String[] entryOf = text.split(" ");
		
		countOccurences.put(text,0);
		
		//for (Entry<String, Integer> entry : countOccurences.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}//
		for (int i = 0; i < text.length(); i++) {
			
			System.out.println(entryOf[i]);
		}
		for (Entry<String, Integer> entry : countOccurences.entrySet()) {
	           System.out.println("clé: "+entry.getKey() + " | valeur: " + entry.getValue());
	        }
		return countOccurences;*/
		
		public static Map<String, Integer> countWordOccurences(String text) {
				HashMap<String, Integer> wordsCounters = new HashMap<String, Integer>();

				String[] words = text.split(" ");

				for (String currentWord : words) {	
					Integer counter = wordsCounters.getOrDefault(currentWord, 0);
					wordsCounters.put(currentWord, counter + 1);
				}
				
				return wordsCounters;
		
	
	}

	
}