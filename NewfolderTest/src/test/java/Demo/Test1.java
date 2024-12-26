package Demo;

public class Test1 {

	public static void main(String[] args) {

		String[] input = { "flower", "flow", "flood","cat" };
		String output = "flo";
		for (String s : input) {
			String s1=s.substring(0, 3);
			if (s1.equals(output)) {
				System.out.println("Matching : "+s1);
			} else {
				System.out.println("Not Matching");
			}
		}

	}

}
