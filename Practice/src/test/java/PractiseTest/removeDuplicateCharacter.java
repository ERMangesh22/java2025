package PractiseTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharacter {

	public static void main(String[] args) {

		String input ="aabbccd";
		Set<Character> s = new LinkedHashSet<Character>();
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			s.add(c);
			
		}
		for(char ch:s) {
			System.out.print(ch);
		}
	}

}
