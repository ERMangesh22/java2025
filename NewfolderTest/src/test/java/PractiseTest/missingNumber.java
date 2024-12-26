package PractiseTest;

public class missingNumber {

	public static void main(String[] args) {

		int num=0;
		int[] input = {1,2,3,5};
		for(int i=0;i<=input.length;i++)
		{
			num=input[i];
			num= num+1;
			if(num==input[i+2]) {
				System.out.println("found" +num);
			}
		}
	}
}
