package PractiseTest;

public class CountLength {

	public static void main(String[] args) {

		String name ="I am Mangesh vivek";
		
		
//		String s1 =(name.substring(5, 12));
//		System.out.println(s1);
//		System.out.println(s1.length());
		
		String s2[]= name.split(" ");
		int length=s2.length;
		for(int i=length-1;i>0;i++) {
			System.out.println(s2[3]);
			break;
		}
		System.out.println("Total Length is :"+s2[3].length());
			
			
		}
		
		
		


}
