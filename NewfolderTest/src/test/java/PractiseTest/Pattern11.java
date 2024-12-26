package PractiseTest;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,j,n=5;
		for(i=1;i<=5;i++) {
			int ch=65;
			for(j=1;j<=i;j++) {
				System.out.print(" "+(char)ch);
				ch++;
			}
			System.out.println();
		}
	}

}
