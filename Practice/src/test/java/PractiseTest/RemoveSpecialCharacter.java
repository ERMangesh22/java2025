package PractiseTest;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="45@#458$%7800";
		
		String output=input.replaceAll("[^0-9]", "");
		System.out.println(output);
		String s1[]=output.split("");
		for(String i:s1) {
			System.out.print(i);
		}
		
		
	

}
}