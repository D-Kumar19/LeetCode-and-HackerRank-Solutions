package LeetCode.Java;

public class FirstPalindromicString4 {
	public static String firstPalindrome(String[] words) {
		for (String word : words) {
			if(reverse(word)) return word;
		}
		return "";
	}

	// Method # 01:
	/*
	public static boolean reverse(String word) {
		int i = word.length() / 2;
		int j = word.length()%2 == 0 ? word.length()/2 - 1 : word.length()/2;

		while (i <= word.length() && j >= 0) {
			System.out.println(word.charAt(i) + " " + word.charAt(j));
			if (word.charAt(i++) != word.charAt(j--)) return false;
		}
		return true;
	}
	 */

	// Method # 02:
	public static boolean reverse(String word) {
		int i = 0;
		int j = word.length() - 1;

		while (i < j) {
			System.out.println(word.charAt(i) + " " + word.charAt(j));
			if (word.charAt(i++) != word.charAt(j--)) return false;
		}
		return true;
	}

	// Method # 03:
	/*
	public static String firstPalindrome(String[] words) {
		for (String word : words) {
			StringBuilder stringBuilder = new StringBuilder(word);
			if(stringBuilder.reverse().toString().equals(word)) return word;
		}
		return "";
	}
	 */
}