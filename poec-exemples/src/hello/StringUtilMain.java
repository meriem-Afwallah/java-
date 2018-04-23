package hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringUtilMain {

	public static void main(String[] args) {
		
		String texte = "bonjour le monde";
		
		 //compte le nombre de caractères autres que espace
		int charCount = StringUtil.countCharacters(texte); // 14
		System.out.println(charCount);
		
		// compte le nombre de mots (les mots sont séparés par des espaces)
		int wordsCount = StringUtil.countWords(texte); // 3
		System.out.println(wordsCount);
		System.out.println(StringUtil.countWords(""));
		System.out.println(StringUtil.countWords("abc   def   ghi"));
		System.out.println(StringUtil.countWords(" abc   def   ghi"));
		System.out.println(StringUtil.countWords("    abc   def   ghi"));
		System.out.println(StringUtil.countWords(" abc   def   ghi "));
		System.out.println(StringUtil.countWords("  abc   def   ghi  "));
		System.out.println(StringUtil.countWords("   abc   def    "));
		System.out.println(StringUtil.countWords("   abc"));
		System.out.println(StringUtil.countWords("   abc   "));
		System.out.println(StringUtil.countWords("         "));
		
		// retourne true si palindrome, false sinon
		System.out.println(StringUtil.isPalindrome(texte)); // false
		System.out.println(StringUtil.isPalindrome("radar")); // true
		System.out.println(StringUtil.isPalindrome("")); // false
		System.out.println(StringUtil.isPalindrome("a")); //  false
		System.out.println(StringUtil.isPalindrome("aa")); // true
		System.out.println(StringUtil.isPalindrome("ab")); // false
		System.out.println(StringUtil.isPalindrome("a  b  a")); // true
		
		// retourne true si anagramme, false sinon
		// stringUtil.isAnagramme("romain", "manoir"); // true
		// v2 avec des phrases séparées par des espace
		// stringUtil.isAnagramme("Pablo Picasso", "Pascal Obispo"); // true
		
		String text = 
				"The core collection interfaces encapsulate "
				+ "different types of collections, which are "
				+ "shown in the figure below. "
				+ "These interfaces allow collections to be manipulated "
				+ "independently of the details of their representation. "
				+ "Core collection interfaces are the foundation of the "
				+ "Java Collections Framework. As you can see in the "
				+ "following figure, the core collection interfaces "
				+ "form a hierarchy.";
		// of 4 => 16
		// the 6 => 36
		// collection 3 => 9
		// in 2 => 4
		Map<String, Integer> occurences = StringUtil.countWordOccurences(text);		
		
		for(Entry<String, Integer> entry : occurences.entrySet()) {
			System.out.format("%s : %d%n", entry.getKey(), entry.getValue());
		
		}
	}

}

