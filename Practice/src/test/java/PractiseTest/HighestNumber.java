package PractiseTest;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class HighestNumber {

	public static void main(String[] args) {

		int[] arr = {233,19000,16000,15,25,60,54,100,1,2000,8000,25000};
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//					
//				max=arr[i];
//				
//					
//				}
//			
//			}
//		System.out.println(max);
		
		Set<Integer> s = new TreeSet<Integer>();
		for(int a:arr) {
			s.add(a);
		}
		System.out.println(s);
		Arrays.sort(arr);
		
		}
		
		
	

}
